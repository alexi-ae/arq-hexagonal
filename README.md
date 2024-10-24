# Arquitectura Hexagonal

La **Arquitectura Hexagonal**, también conocida como **Arquitectura de Puertos y Adaptadores**, fue propuesta por Alistair Cockburn. Su principal objetivo es separar el núcleo de la aplicación de las interacciones externas, como bases de datos, interfaces de usuario y servicios externos. Esto permite que la aplicación sea más flexible, mantenible y fácil de probar.

## Principios Clave

- **Separación de Responsabilidades**: La lógica de negocio se encuentra en el centro, mientras que las interacciones externas se manejan a través de puertos y adaptadores.
- **Independencia de la Interfaz**: La aplicación puede funcionar sin una interfaz de usuario, lo que facilita la realización de pruebas automatizadas.
- **Flexibilidad**: Permite cambiar o reemplazar componentes externos sin afectar el núcleo de la aplicación.

## Estructura del Proyecto

A continuación se presenta la estructura del proyecto base, junto con una breve explicación de cada paquete:
```shell
src
└── main
    ├── java
    │   └── com
    │       └── alexiae
    │           └── arq
    │               └── hexagonal
    │                   |   ArqHexagonalApplication.java
    │                   |
    │                   +--- application
    │                   |   +--- mapper
    │                   |   |       AccountMapper.java
    │                   |   |       CustomerMapper.java
    │                   |   |       TransactionMapper.java
    │                   |   |
    │                   |   +--- service
    │                   |   |       AccountManagementService.java
    │                   |   |       CustomerManagementService.java
    │                   |   |       TransactionManagementService.java
    │                   |   |
    │                   |   \--- usercase
    │                   |           AccountService.java
    │                   |           CustomerService.java
    │                   |           TransactionService.java
    │                   |
    │                   +--- domain
    │                   |   +--- dto
    │                   |   |   |   AccountDto.java
    │                   |   |   |   CustomerDto.java
    │                   |   |   |   TransactionDto.java
    │                   |   |   |
    │                   |   |   \--- request
    │                   |   |           AccountRequest.java
    │                   |   |           CustomerRequest.java
    │                   |   |           TransactionRequest.java
    │                   |   |
    │                   |   +--- model
    │                   |   |       Account.java
    │                   |   |       Customer.java
    │                   |   |       Transaction.java
    │                   |   |
    │                   |   \--- port
    │                   |           AccountPersistencePort.java
    │                   |           CustomerPersistencePort.java
    │                   |           TransactionPersistencePort.java
    │                   |
    │                   +--- infrastructure
    │                   |   +--- adapter
    │                   |   |   AccountJpaAdapter.java
    │                   |   |   CustomerJpaAdapter.java
    │                   |   |   TransactionJpaAdapter.java
    │                   |   |
    │                   |   +--- entity
    │                   |   |       AccountEntity.java
    │                   |   |       CustomerEntity.java
    │                   |   |       TransactionEntity.java
    │                   |   |
    │                   |   +--- mapper
    │                   |   |       AccountDboMapper.java
    │                   |   |       CustomerDboMapper.java
    │                   |   |       TransactionDboMapper.java
    │                   |   |
    │                   |   \--- repository
    │                   |           AccountRepository.java
    │                   |           CustomerRepository.java
    │                   |           TransactionRepository.java
    │                   |
    │                   \--- rest
    │                           AccountController.java
    │                           CustomerController.java
    │                           TransactionController.java
    │
    └── resources
        |   application.properties
        |
        +--- static
        \--- templates
└── test
    \--- java
        \--- com
            \--- alexiae
                \--- arq
                    \--- hexagonal
                            ArqHexagonalApplicationTests.java

```

# Descripción de Cada Paquete

##  application
Contiene la lógica de aplicación, incluyendo servicios y mapeadores que transforman datos entre diferentes capas.

- ### mapper
Clases que se encargan de convertir entre entidades y DTOs (Data Transfer Objects).

- ### service
Servicios que implementan la lógica de negocio y gestionan las operaciones relacionadas con las entidades.

- ### usercase
Clases que representan casos de uso específicos de la aplicación, encapsulando la lógica necesaria para ejecutar acciones.

## - domain
Contiene las entidades del dominio y sus representaciones.

- ### dto
Clases que representan los objetos de transferencia de datos utilizados para la comunicación entre capas.

- ### model
Clases que representan las entidades del dominio, reflejando la lógica de negocio.

- ### port
Interfaces que definen los contratos para la persistencia de datos, permitiendo la implementación de diferentes adaptadores.

## infrastructure
Contiene las implementaciones específicas de la infraestructura, como adaptadores y repositorios.

- ### adapter
Implementaciones que conectan la lógica de negocio con la infraestructura externa (por ejemplo, bases de datos).

#### - entity
Clases que representan las entidades en la base de datos, reflejando la estructura de datos persistente.

#### - mapper
Clases que convierten entre entidades de la base de datos y modelos de dominio.

#### - repository
Interfaces que definen las operaciones de acceso a datos, permitiendo la interacción con la base de datos.

- ### rest
Controladores REST que manejan las solicitudes HTTP y responden a los clientes, actuando como la interfaz entre el usuario y la lógica de negocio.

## resources
Archivos de configuración y recursos estáticos utilizados por la aplicación, como el archivo `application.properties` para la configuración de la aplicación.

## test
Contiene las pruebas unitarias y de integración para la aplicación, asegurando que la lógica de negocio funcione correctamente.

---

# Conclusión
La arquitectura hexagonal proporciona una forma efectiva de estructurar aplicaciones, permitiendo una separación clara entre la lógica de negocio y las interacciones externas. Esta estructura de proyecto facilita el mantenimiento y la escalabilidad, al tiempo que permite realizar pruebas de manera más sencilla.
