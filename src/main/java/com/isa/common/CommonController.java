package com.isa.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by test on 2018-07-21.
 */
@RestController
@RequestMapping("/api/v1/")
public class CommonController {

    @Value("${static.resource.path}")
    private String assetPath;


    @Value("${static.resource.uri}")
    private String assetUri;


    @RequestMapping(value="/common/image/upload", method = RequestMethod.POST )
    public String uploadProfilePhoto(@RequestParam("img")MultipartFile img, @RequestParam("imgName") String imgName){


        //TODO File Name Validation profile_photo length(45)
        File newFile    =   null;
        if(!img.isEmpty()){
            try{
                System.out.println(assetPath + imgName);
                newFile     =   new File(assetPath + imgName);
                if(newFile.createNewFile()){}

                BufferedOutputStream stream     =   new BufferedOutputStream(new FileOutputStream(newFile));


                FileCopyUtils.copy(img.getInputStream(), stream);


                stream.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }


        return assetUri + "img/profile/" + newFile.getName();
    }
}
