package com.gof.designpattern.factory;

import com.gof.designpattern.content.Content;
import com.gof.designpattern.layout.Layout;
import com.gof.designpattern.layout.MobileLayout;
import com.gof.designpattern.layout.WebLayout;
import com.gof.designpattern.util.Flags;

/**
 * Created by yl3 on 21.11.15.
 */
public class LayoutFactory extends ContentLayoutAbstractFactory {
    @Override
    public Content getContent(String contentType) {
        return null;
    }

    public Layout getLayout(String layoutType) {
        if (Flags.MOBILE_TYPE.equals(layoutType)) {
            return new MobileLayout();
        } else if (Flags.WEB_TYPE.equals(layoutType)) {
            return new WebLayout();
        }
        return null;
    }
}
