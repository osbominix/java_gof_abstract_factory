package com.gof.designpattern.factory;

import com.gof.designpattern.util.Flags;

/**
 * Created by yl3 on 21.11.15.
 */
public class FactoryGenerator {


    public static ContentLayoutAbstractFactory getFactory(String factoryType){

        if(Flags.LAYOUT_FACTORY.equals(factoryType)){
            return new LayoutFactory();

        }else if(Flags.CONTENT_FACTORY.equals(factoryType)){
            return new ContentFactory();
        }

        return null;
    }
}
