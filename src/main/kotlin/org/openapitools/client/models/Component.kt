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
 *
 *
 * @param description
 * @param id
 * @param key
 * @param new
 * @param sequenceNo
 * @param survey
 * @param text
 */

@Serializable
data class Component(

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val key: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val sequenceNo: kotlin.Int? = null,

    val survey: Survey? = null,

    val text: kotlin.String? = null

)

