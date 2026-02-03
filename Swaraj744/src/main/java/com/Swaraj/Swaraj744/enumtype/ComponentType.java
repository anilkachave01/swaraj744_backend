package com.Swaraj.Swaraj744.enumtype;

public enum ComponentType {

    THRESHER {
        public double price(Double acres, Integer pots) {
            return pots * 200;
        }
    },
    VAKHAR {
        public double price(Double acres, Integer pots) {
            return acres * 500;
        }
    },
    FIVE_FANTI {
        public double price(Double acres, Integer pots) {
            return acres * 800;
        }
    },
    NINE_FANTI,
    NAGAR,
    PERNI_YANTRA {
        public double price(Double acres, Integer pots) {
            return acres * 600;
        }
    },
    ROTAVATOR {
        public double price(Double acres, Integer pots) {
            return acres * 1000;
        }
    };

    public double price(Double acres, Integer pots) {
        return pots * 1000; // default
    }
}

