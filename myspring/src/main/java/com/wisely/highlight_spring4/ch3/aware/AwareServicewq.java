package com.wisely.highlight_spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareServicewq implements BeanNameAware, ResourceLoaderAware {

    public String beanName;
    public ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;

    }

    public void outputResoult(){
        System.out.println("Bean的名称是： " + this.beanName);
        Resource resource =
                this.loader.getResource("file:/Users/my_java/springLearn/myspring/src/main/java/com/wisely/highlight_spring4/ch2/el/test.txt");
        try{
            System.out.println("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
