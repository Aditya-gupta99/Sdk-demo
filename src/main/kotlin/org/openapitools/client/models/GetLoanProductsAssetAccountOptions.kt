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

import org.openapitools.client.models.GetLoanProductsLiabilityTagId
import org.openapitools.client.models.GetLoanProductsLiabilityType
import org.openapitools.client.models.GetLoanProductsLiabilityUsage

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param disabled 
 * @param glCode 
 * @param id 
 * @param manualEntriesAllowed 
 * @param name 
 * @param nameDecorated 
 * @param organizationRunningBalance 
 * @param tagId 
 * @param type 
 * @param usage 
 */


data class GetLoanProductsAssetAccountOptions (

    @Json(name = "disabled")
    val disabled: kotlin.Boolean? = null,

    @Json(name = "glCode")
    val glCode: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "manualEntriesAllowed")
    val manualEntriesAllowed: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "nameDecorated")
    val nameDecorated: kotlin.String? = null,

    @Json(name = "organizationRunningBalance")
    val organizationRunningBalance: kotlin.Int? = null,

    @Json(name = "tagId")
    val tagId: GetLoanProductsLiabilityTagId? = null,

    @Json(name = "type")
    val type: GetLoanProductsLiabilityType? = null,

    @Json(name = "usage")
    val usage: GetLoanProductsLiabilityUsage? = null

) {


}

