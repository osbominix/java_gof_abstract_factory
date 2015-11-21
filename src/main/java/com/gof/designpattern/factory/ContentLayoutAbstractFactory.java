package com.gof.designpattern.factory;

import com.gof.designpattern.content.Content;
import com.gof.designpattern.layout.Layout;

/**
 * Created by yl3 on 21.11.15.
 */
public abstract class ContentLayoutAbstractFactory {
    public abstract Content getContent(String contentType);
    public abstract Layout getLayout(String layoutType) ;
}
