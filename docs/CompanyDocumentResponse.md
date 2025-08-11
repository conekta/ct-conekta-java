

# CompanyDocumentResponse

Response body after uploading a company document.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileClassification** | [**FileClassificationEnum**](#FileClassificationEnum) | Classification of the document.  | Tipo de archivo              | Descripción                                               | | :--------------------------- | :-------------------------------------------------------- | | &#x60;id_legal_representative&#x60;      | identificación oficial frente                             | | &#x60;id_legal_representative_back&#x60; | identificación oficial atrás                              | | &#x60;cfdi&#x60;                         | Prueba de situación fiscal                                | | &#x60;constitutive_act_basic&#x60;       | Acta constitutiva                                         | | &#x60;proof_of_address&#x60;             | Comprobante de domicilio del negocio                      | | &#x60;power_of_attonery&#x60;            | Poderes de representación                                 | | &#x60;deposit_account_cover&#x60;        | Carátula de la cuenta de depósito                         | | &#x60;permit_casino&#x60;                | Permiso ante SEGOB                                        | | &#x60;license_sanitation&#x60;           | Licencia sanitaria de COFEPRIS                            | | &#x60;registration_tourism&#x60;         | Inscripción ante el Registro Nacional de Turismo (SECTUR) |  |  |
|**fileName** | **String** | Name of the file as stored or processed. |  |
|**status** | **String** | Current status of the document. |  |



## Enum: FileClassificationEnum

| Name | Value |
|---- | -----|
| ID_LEGAL_REPRESENTATIVE | &quot;id_legal_representative&quot; |
| ID_LEGAL_REPRESENTATIVE_BACK | &quot;id_legal_representative_back&quot; |
| CFDI | &quot;cfdi&quot; |
| CONSTITUTIVE_ACT_BASIC | &quot;constitutive_act_basic&quot; |
| PROOF_OF_ADDRESS | &quot;proof_of_address&quot; |
| POWER_OF_ATTONERY | &quot;power_of_attonery&quot; |
| DEPOSIT_ACCOUNT_COVER | &quot;deposit_account_cover&quot; |
| PERMIT_CASINO | &quot;permit_casino&quot; |
| LICENSE_SANITATION | &quot;license_sanitation&quot; |
| REGISTRATION_TOURISM | &quot;registration_tourism&quot; |



