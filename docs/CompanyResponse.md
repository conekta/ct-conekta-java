

# CompanyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the company. |  |
|**name** | **String** | The name of the company. |  |
|**active** | **Boolean** | Indicates if the company is active. |  |
|**accountStatus** | **String** | The current status of the company&#39;s account. |  |
|**parentCompanyId** | **String** | The identifier of the parent company, if any. |  [optional] |
|**onboardingStatus** | **String** | The current status of the company&#39;s onboarding process. |  |
|**documents** | [**List&lt;CompanyDocumentResponse&gt;**](CompanyDocumentResponse.md) | A list of documents related to the company. |  |
|**createdAt** | **Long** | Timestamp of when the company was created. |  |
|**_object** | **String** | The type of object, typically \&quot;company\&quot;. |  |
|**threeDsEnabled** | **Boolean** | Indicates if 3DS authentication is enabled for the company. |  [optional] |
|**threeDsMode** | [**ThreeDsModeEnum**](#ThreeDsModeEnum) | The 3DS mode for the company, either &#39;smart&#39; or &#39;strict&#39;. This property is only applicable when three_ds_enabled is true. When three_ds_enabled is false, this field will be null. |  [optional] |



## Enum: ThreeDsModeEnum

| Name | Value |
|---- | -----|
| SMART | &quot;smart&quot; |
| STRICT | &quot;strict&quot; |



