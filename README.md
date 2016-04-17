##A Lightweight Java Client Library for Fiware-Orion NGSI APIv1

### Basic Usage

```java
ContextElement contextElement = new ContextElement("Room", "Room1", false);
contextElement.addAttribute(new Attribute("temperature", "float", "23"));
contextElement.addAttribute(new Attribute("pressure", "integer", "720"));

UpdateContext updateContext = new UpdateContext();
updateContext.setUpdateAction(UpdateAction.APPEND);
updateContext.addContextElement(contextElement);

//Synchronous Request
Response<FiwareResponse> response = FiwareOrionClient.serverAddress(SERVER_ADDRESS)
        .updateContext(updateContext)
        .executeRequest();
        
//Asynchronous Request
FiwareOrionClient.serverAddress(SERVER_ADDRESS)
        .updateContext(updateContext)
        .asyncRequest(new FiwareCallback() {
            @Override
            public void onResponseSuccess(FiwareResponse fiwareResponse, String rawBody) {
            }
            @Override
            public void onResponseFailure(Throwable t) {
            }
        });

```
