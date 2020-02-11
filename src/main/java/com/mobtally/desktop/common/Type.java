package com.mobtally.desktop.common;

public enum Type {

    DATA {
        @Override
        public String toString() {
            return "DATA";
        }
    },
    COLLECTION {
        @Override
        public String toString() {
            return "COLLECTION";
        }
    },
    OBJECT {
        @Override
        public String toString() {
            return "OBJECT";
        }
    },
    ACTION {
        @Override
        public String toString() {
            return "ACTION";
        }
    },
    FUNCTION {
        @Override
        public String toString() {
            return "FUNCTION";
        }
    }
}
