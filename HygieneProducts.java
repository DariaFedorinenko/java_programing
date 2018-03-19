package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.Age;
import ua.lviv.iot.model.enums.Expiration;

    public  class HygieneProducts extends ChildGoods {
        private double volume ;
        private String application ;
        private String properties ;

        public HygieneProducts(String name, Age age, String sex, Expiration expirationDate) {
            super(name, age, sex, expirationDate);
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public String getApplication() {
            return application;
        }

        public void setApplication(String application) {
            this.application = application;
        }

        public String getProperties() {
            return properties;
        }

        public void setProperties(String properties) {
            this.properties = properties;
        }
    }

