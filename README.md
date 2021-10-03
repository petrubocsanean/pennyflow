# pennyflow
Personal finance and expenses management app.

## Overview

### Application

This layer contains all application logic. It is dependant on the domain layer, but has no deps on any other layer. This layer defines interfaces that are implemented by outside layers. For example if the application need to access a notification service, a new interface would be added to application and and implementation would be done within infrastrucutre.

### Domain

This contains all entities, enums, exceptions, interfaces, types and logic specific to the domain layer.

### Infrastructure

This layer contains classes for accessing external resources such as file systems, web services, smtp, and so on. These classes should be based on interfaces defined within the application layer.

### Web

This layer contains all controllers and depends on the Application and Infrastructure layers.
