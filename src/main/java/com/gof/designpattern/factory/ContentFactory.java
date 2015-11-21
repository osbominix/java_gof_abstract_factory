package com.gof.designpattern.factory;

import com.gof.designpattern.content.Content;
import com.gof.designpattern.content.MobileContent;
import com.gof.designpattern.content.WebContent;
import com.gof.designpattern.layout.Layout;
import com.gof.designpattern.layout.MobileLayout;
import com.gof.designpattern.layout.WebLayout;
import com.gof.designpattern.util.Flags;

/**
 * Created by yl3 on 21.11.15.
 */
public class ContentFactory extends ContentLayoutAbstractFactory{
    public Content getContent(String contentType) {
        if (Flags.MOBILE_TYPE.equals(contentType)) {
            return new MobileContent();
        } else if (Flags.WEB_TYPE.equals(contentType)) {
            return new WebContent();
        }
        return null;
    }

    @Override
    public Layout getLayout(String layoutType) {
        return null;
    }
}
