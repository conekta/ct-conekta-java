

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
|**documents** | [**List&lt;CompanyResponseDocumentsInner&gt;**](CompanyResponseDocumentsInner.md) | A list of documents related to the company. |  |
|**createdAt** | **Long** | Timestamp of when the company was created. |  |
|**_object** | **String** | The type of object, typically \&quot;company\&quot;. |  |



