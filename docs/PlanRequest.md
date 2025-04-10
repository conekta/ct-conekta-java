

# PlanRequest

a plan

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The amount in cents that will be charged on the interval specified. |  |
|**currency** | **String** | ISO 4217 for currencies, for the Mexican peso it is MXN/USD |  [optional] |
|**expiryCount** | **Integer** | Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count. |  [optional] |
|**frequency** | **Integer** | Frequency of the charge, which together with the interval, can be every 3 weeks, every 4 months, every 2 years, every 5 fortnights |  |
|**id** | **String** | internal reference id |  [optional] |
|**interval** | [**IntervalEnum**](#IntervalEnum) | The interval of time between each charge. |  |
|**name** | **String** | The name of the plan. |  |
|**trialPeriodDays** | **Integer** | The number of days the customer will have a free trial. |  [optional] |
|**maxRetries** | **Integer** | (optional) Specifies the maximum number of retry attempts for a subscription payment before it is canceled. |  [optional] |
|**retryDelayHours** | **Integer** | (optional)  Defines the number of hours between subscription payment retry attempts. |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEK | &quot;week&quot; |
| HALF_MONTH | &quot;half_month&quot; |
| MONTH | &quot;month&quot; |
| YEAR | &quot;year&quot; |



