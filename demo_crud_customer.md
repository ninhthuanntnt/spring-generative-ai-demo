# Step to run

### 1. Generate code structure (ChatGPT)

> Generate spring code base contains these thing CustomerEntity, CustomerRepository, CustomerService, CustomerController
> and other class for Product and Order. Start from this base package com.ntnt.epam.generative.ai.demo. It include
> exception package which have a global exception handler and not found exceptions for entities above. It also includes
> mapper package that support to map req to entity using mapstruct. It have a dto package which contain 2 child package
> is request and response. Request contains CustomerCreateReq, CustomerUpdateReq and other class for Product and Order.
> Response Package contains CustomerRes and other class for Product and Order. No need to include main class. Finally,
> Show me the code structure only

### 2. Generate Powershell commands to generate this code base (ChatGPT)

> Help me generate the powershell command to generate folders and files in com.ntnt.epam.generative.ai.demo. I've
> already cd into com.ntnt.epam.generative.ai.demo

### 3. Run powershell commands to generate code base

// Start run

### 4. Start coding on CustomerEntity.java (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate CustomerEntity contains these fields id (Long), name, address, and phoneNumber. Using Hibernate
// and Lombok. the name of the table use in plural form. Only using @Column to map camelCase to snake_case for upper 1
// syllable variable.
```

Then select all.

### 5. Generate ProductEntity.java (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate ProductEntity contains these fields id (Long), name, price (BigDecimal), and type (Enum). Using Hibernate
// and Lombok. the name of the table use in plural form. Only using @Column to map camelCase to snake_case for upper 1
// syllable variable.
```

Then select all.
<br/>
After generating code. Add a ProductType enum.

### 6. Generate OrderEntity.java (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate OrderEntity which includes id (Long), customerId, customerName, productId, amount (BigDecimal) and
// orderDate (Instant). Using Hibernate and Lombok. The table's name is used in plural form. And
// use @Column to map camelCase to snake_case. productId is id from ProductEntity and customerId is id from
// CustomerEntity. And add @ManyToOne to map productId to ProductEntity and customerId to CustomerEntity.
```

Then select all.

### 7. Generate CustomerRepository.java (GitHub Copilot)

Only use suggestion, no need to write comment.

### 8. Generate code for NotFoundException. (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate NotFoundException extends RuntimeException. This exception contain an ErrorCode Enum.
```

Then select all.

### 9. Generate code for ErrorRes. (GitHub Copilot)

Using tab to show suggestion. ErrorRes should contain code and message.
Or type this comment:

```java
// Generate ErrorRes contain code and message. Using lombok.
```

Then select all.

### 10. Generate code for GlobalExceptionHandler (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate GlobalExceptionHandler which handle NotFoundException, Using @RestControllerAdvice and @ExceptionHandler.
// The handler method should return ResponseEntity class.
```

Then select all.

### 11. Add config for mapstruct (GitHub Copilot)

Write the comment in build.grale > dependencies

```groovy
// Add config for mapstruct
```

### 11. Generate code for CustomerMapper (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate CustomerMapper interface using Mapstruct. it contain a method to convert CustomerEntity to CustomerRes,
// CustomerCreateReq to CustomerEntity, override CustomerEntity in database by CustomerUpdateReq.
```

Then select all.

### 12. Generate code in request and response package (ChatGPT)

Write this message:
> Help me generate CustomerCreateReq from given class. And using lombok without using
> @Data. Wait me to give you the class.

Then copy the class and send it for ChatGPT.
After it show the suggestion then use it for current and other class.

### 13. Add config to appication.yml to return a snake case json (GitHub Copilot)

Go to appication.yml and add write this comment:

```yaml
#Config for json return snake case
```

Then enter and using tab to complete the config code.

### 14. Generate CustomerService (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate CustomerService class. It supports CRUD operation for CustomerEntity. create and update method should use
// CustomerMapper to convert between CustomerEntity and CustomerCreateReq/CustomerUpdateReq in parameter and using
// CustomerMapper to convert it to CustomerEntity. Should throw NotFoundException. Should return CustomerEntity.
```

Then select all.

### 15. Generate CustomerController (GitHub Copilot)

Fill package com.ntnt....
<br/>
write this comment under the package code:

```java
// Generate CustomerController class. It supports CRUD operation and using CustomerService to do that. Should return
// ResponseEntity and using CustomerMapper to map to CustomerRes before return.
```

Then select all.

### 16. Add flyway migration code (ChatGPT)

Write this message:
> Help me generate flyway migration code to create table for provided Entity. The result should be the code only no need
> to explain. Wait me to give you the class.

Then copy the class and send it for ChatGPT.

### 17. Add H2 dependencies (GitHub Copilot)

Write the comment in build.grale > dependencies

```groovy
// Add H2 dependencies
```

Then enter and using tab to do the rest.

### 18. Add config to application.yml to connect to H2 database (GitHub Copilot)

Write this comment:

```yaml
# config to connect to in memory H2 database
```

Then enter and using tab to complete the config code.
