# Smart-Manufacturing-Production-Planning-System
#Project Structure 
src/
└── main/
    ├── java/
    │   └── com/
    │       └── smartmanagement/
    │           ├── product/
    │           │   ├── controller/
    │           │   │   └── ProductMasterController.java
    │           │   ├── service/
    │           │   │   ├── ProductMasterService.java
    │           │   │   └── impl/
    │           │   │       └── ProductMasterServiceImpl.java
    │           │   └── model/
    │           │       └── FinishedProduct.java
    │           ├── production/
    │           │   ├── controller/
    │           │   │   └── ProductionOrderController.java
    │           │   ├── service/
    │           │   │   ├── ProductionOrderService.java
    │           │   │   └── impl/
    │           │   │       └── ProductionOrderServiceImpl.java
    │           │   └── model/
    │           │       └── ProductionOrder.java
    │           ├── monitoring/
    │           │   ├── controller/
    │           │   │   └── MachineController.java
    │           │   ├── service/
    │           │   │   ├── MachineService.java
    │           │   │   └── impl/
    │           │   │       └── MachineServiceImpl.java
    │           │   └── model/
    │           │       └── MachineLog.java
    │           ├── quality/
    │           │   ├── controller/
    │           │   │   └── QualityController.java
    │           │   ├── service/
    │           │   │   ├── QualityService.java
    │           │   │   └── impl/
    │           │   │       └── QualityServiceImpl.java
    │           │   └── model/
    │           │       └── QualityInspection.java
    │           ├── maintenance/
    │           │   ├── controller/
    │           │   │   └── MaintenanceController.java
    │           │   ├── service/
    │           │   │   ├── MaintenanceService.java
    │           │   │   └── impl/
    │           │   │       └── MaintenanceServiceImpl.java
    │           │   └── model/
    │           │       └── MaintenanceWorkOrder.java
    │           └── config/
    │               └── MockSensorConfig.java
    └── resources/
        ├── application.properties
        ├── static/
        │   ├── css/
        │   └── js/
        └── templates/
            └── dashboard.html
