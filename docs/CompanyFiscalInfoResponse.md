

# CompanyFiscalInfoResponse

Company fiscal info model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The resource&#39;s type |  [optional] |
|**taxId** | **String** | Tax ID of the company |  [optional] |
|**legalEntityName** | **String** | Legal name of the company |  [optional] |
|**businessType** | **String** | Business type of the company |  [optional] |
|**phone** | **String** | Phone number of the company |  [optional] |
|**physicalPersonBusinessType** | **String** | Business type if &#39;persona_fisica&#39; |  [optional] |
|**address** | [**CompanyFiscalInfoAddressResponse**](CompanyFiscalInfoAddressResponse.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| FISCAL_INFO | &quot;fiscal_info&quot; |



