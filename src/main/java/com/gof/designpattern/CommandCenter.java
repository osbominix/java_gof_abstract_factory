package com.gof.designpattern;

import com.gof.designpattern.content.Content;
import com.gof.designpattern.factory.ContentLayoutAbstractFactory;
import com.gof.designpattern.factory.FactoryGenerator;
import com.gof.designpattern.layout.Layout;
import com.gof.designpattern.factory.LayoutFactory;
import com.gof.designpattern.util.Flags;

import java.util.ConcurrentModificationException;

/**
 * Created by yl3 on 21.11.15.
 */
public class CommandCenter {
    public static void main(String[] args) {

        //get layoutFactory, then generate diverse layout
        ContentLayoutAbstractFactory layoutFactory = FactoryGenerator.getFactory(Flags.LAYOUT_FACTORY);

        Layout webLayout = layoutFactory.getLayout(Flags.WEB_TYPE);
        webLayout.generateLayout();

        Layout mobileLayout = layoutFactory.getLayout(Flags.MOBILE_TYPE);
        mobileLayout.generateLayout();

        //get contentFactory, the generate diverse content
        ContentLayoutAbstractFactory contentFactory = FactoryGenerator.getFactory(Flags.CONTENT_FACTORY);

        Content webContent = contentFactory.getContent(Flags.WEB_TYPE);
        webContent.generateContent();

        Content clientContent = contentFactory.getContent(Flags.MOBILE_TYPE);
        clientContent.generateContent();
    }
}
