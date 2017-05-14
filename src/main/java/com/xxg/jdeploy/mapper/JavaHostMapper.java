package com.xxg.jdeploy.mapper;

import com.xxg.jdeploy.domain.JavaHostInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Chance on 2017/5/13.
 */
public interface JavaHostMapper {

    @Select("SELECT hostId,name,path FROM java_web_host")
    List<JavaHostInfo> getHosts();
}
