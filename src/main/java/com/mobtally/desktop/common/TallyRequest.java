package com.mobtally.desktop.common;

public enum TallyRequest {

    EXPORT {
        @Override
        public String toString() {
            return "Export";
        }
    }, IMPORT {
        @Override
        public String toString() {
            return "Import";
        }
    }, EXECUTE {
        @Override
        public String toString() {
            return "Execute";
        }
    }
}
