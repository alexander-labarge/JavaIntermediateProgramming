import java.util.ArrayList;
import java.util.List;

class MobileDevice {
        // Global variables of the class initialized
        private String brand;
        private String model;
        private String os;
        private String exploit;

        public void setNewDeviceData(String brand, String model, String os, String exploit) {
            this.brand = brand;
            this.model = model;
            this.os = os;
            this.exploit = exploit;
        }
        public String getNewDeviceData(){
            return this.brand +
                    " /" +
                    this.model +
                    " /" +
                    this.os +
                    " /" +
                    this.exploit;
        }

}


