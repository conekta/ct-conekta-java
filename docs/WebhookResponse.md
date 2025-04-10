

# WebhookResponse

webhooks model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | id of the webhook |  [optional] |
|**description** | **String** | A name or brief explanation of what this webhook is used for |  [optional] |
|**livemode** | **Boolean** | Indicates if the webhook is in production |  [optional] |
|**active** | **Boolean** | Indicates if the webhook is actived or not |  [optional] |
|**_object** | **String** | Object name, value is &#39;webhook&#39; |  [optional] |
|**status** | **String** | Indicates if the webhook is ready to receive events or failing |  [optional] |
|**subscribedEvents** | **List&lt;String&gt;** | lists the events that will be sent to the webhook |  [optional] |
|**url** | **String** | url or endpoint of the webhook |  [optional] |



