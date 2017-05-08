package parallel.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description>
 * Copyright © 2006-2017 AboutCoder.COM. All rights reserved.<br />
 *
 * @author chenjinlong<br />
 * @CreateDate 20/01/2017 3:29 PM<br />
 * @description <br />
 */
public class ESingletonController {

    /**
     * Singleton example 01
     */
//    private ESingletonController() {}
//
//    private static ESingletonController instance = new ESingletonController();
//
//    public static ESingletonController getInstance() {
//        return instance;
//    }

    /**
     * Singleton example 02
     */
//    private ESingletonController(){}
//
//    private static ESingletonController instance;
//
//    public static ESingletonController getInstance() {
//        if (null == instance) {
//            return new ESingletonController();
//        } else {
//            return instance;
//        }
//    }

    /**
     * Singleton example 03
     * using delay strategy.
     */
//    private ESingletonController(){}
//
//    private static class ESingletonControllerHolder {
//        private static ESingletonController instance = new ESingletonController();
//    }
//
//    private static ESingletonController getInstance() {
//        return ESingletonControllerHolder.instance;
//    }
}
