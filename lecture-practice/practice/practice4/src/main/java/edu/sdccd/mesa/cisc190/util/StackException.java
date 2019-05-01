package edu.sdccd.mesa.cisc190.util;

public class StackException extends Exception {

    /**
     * Constructor for objects of class StackException
     */
    public StackException(String message) {
        super(message);
    }

    /*package*/ static class StackUnderflowException extends StackException {
        private static final String UNDERFLOW_MESSAGE = "Pop or peek requested on empty stack";
        /**
         * Constructor for objects of class StackUnderflowException
         */
        public StackUnderflowException() {
            super(UNDERFLOW_MESSAGE);
        }
    }
}
