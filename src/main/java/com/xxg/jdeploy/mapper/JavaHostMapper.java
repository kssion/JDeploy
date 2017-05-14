package com.xxg.jdeploy.mapper;

import com.xxg.jdeploy.domain.JavaHostInfo;
import com.xxg.jdeploy.domain.JavaWebDeployInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JavaHostMapper {

    @Select("SELECT hostId,name,path FROM java_web_host")
    List<JavaHostInfo> getHosts();

    @Select("select uuid,name,url,context_path as contextPath,port,type from java_web_deploy where hostId=#{uuid}")
    List<JavaWebDeployInfo> getHostApps(String uuid);
}
