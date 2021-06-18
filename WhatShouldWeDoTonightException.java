
/**
 * Write a description of class WhatShouldWeSoTonightException here.
 *
 * @author Niktia Patel
 * @version 1
 */
public class WhatShouldWeDoTonightException extends RuntimeException
{
    /**
     * WhatShouldWeSoTonightException Constructor
     *
     * @param message A parameter
     */
    public WhatShouldWeDoTonightException(String message)
    {
        super(message);
    }

    /**
     * WhatShouldWeSoTonightException Constructor
     *
     */
    public WhatShouldWeDoTonightException(){
        super("Error in deciding what to do tonight.");
    }
}
