/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.GetRecurringDepositAccountsChartSlabs
import org.openapitools.client.models.GetRecurringDepositAccountsPeriodTypes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountId 
 * @param accountNumber 
 * @param chartSlabs 
 * @param fromDate 
 * @param id 
 * @param periodTypes 
 */


data class GetRecurringDepositAccountsAccountChart (

    @Json(name = "accountId")
    val accountId: kotlin.Long? = null,

    @Json(name = "accountNumber")
    val accountNumber: kotlin.Long? = null,

    @Json(name = "chartSlabs")
    val chartSlabs: kotlin.collections.Set<GetRecurringDepositAccountsChartSlabs>? = null,

    @Json(name = "fromDate")
    val fromDate: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "periodTypes")
    val periodTypes: kotlin.collections.Set<GetRecurringDepositAccountsPeriodTypes>? = null

) {


}

