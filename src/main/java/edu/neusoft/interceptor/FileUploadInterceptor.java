package edu.neusoft.interceptor;

import lombok.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日15:10
 */
public class FileUploadInterceptor implements HandlerInterceptor {
//    @Value("jpg,jpeg,png")
    private String allowFileTypes;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("UTF-8");

        // 文件上传的servlet
        if (request instanceof MultipartHttpServletRequest multipartRequest) {
            // 不允许上传任何文件
            if (allowFileTypes == null) {
                return false;
            }

            // 文件后缀类型
            String[] allowType = allowFileTypes.split(",");
            List<String> allowList = Arrays.stream(allowType).collect(Collectors.toList());

            Iterator<String> it = multipartRequest.getFileNames();
            while (it.hasNext()) {
                String fileParameter = it.next();
                List<MultipartFile> listFile = multipartRequest.getFiles(fileParameter);

                if (!CollectionUtils.isEmpty(listFile)) {
                    String fileName;
                    String fileSuffixType = "";

                    for (MultipartFile file : listFile) {
                        // 获取后缀名
                        fileName = file.getOriginalFilename();

                        int indexLocation;
                        if ((indexLocation = fileName.lastIndexOf(".")) > 0) {
                            fileSuffixType = fileName.substring(indexLocation + 1);
                        }

                        // 后缀名检测
                        if (!allowList.contains(fileSuffixType)) {
                            response.getWriter().write("{\"message\":\"文件类型不允许上传\"}");
                            return false;
                        }

                    }
                }
            }

        }

        return true;
    }
}
