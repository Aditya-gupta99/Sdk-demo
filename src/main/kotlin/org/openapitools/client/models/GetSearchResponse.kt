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

import kotlinx.serialization.Serializable

/**
 * GetSearchResponse
 *
 * @param entityAccountNo
 * @param entityExternalId
 * @param entityId
 * @param entityName
 * @param entityStatus
 * @param entityType
 * @param parentId
 * @param parentName
 */

@Serializable
data class GetSearchResponse(

    val entityAccountNo: kotlin.Long? = null,

    val entityExternalId: kotlin.String? = null,

    val entityId: kotlin.Long? = null,

    val entityName: kotlin.String? = null,

    val entityStatus: EnumOptionData? = null,

    val entityType: kotlin.String? = null,

    val parentId: kotlin.Long? = null,

    val parentName: kotlin.String? = null

)

