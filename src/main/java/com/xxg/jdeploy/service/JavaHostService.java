package com.xxg.jdeploy.service;

import com.xxg.jdeploy.domain.JavaHostInfo;
import com.xxg.jdeploy.domain.JavaWebDeployInfo;
import com.xxg.jdeploy.mapper.JavaDeployMapper;
import com.xxg.jdeploy.mapper.JavaHostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chance on 2017/5/13.
 */
@Service
public class JavaHostService {

    @Autowired
    private JavaHostMapper javaHostMapper;

    public List<JavaHostInfo> getHosts() {
        return javaHostMapper.getHosts();
    }

    public List<JavaWebDeployInfo> getHostApps(String uuid) {
        return javaHostMapper.getHostApps(uuid);
    }

}
