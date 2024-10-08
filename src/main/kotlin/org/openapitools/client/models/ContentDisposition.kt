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


import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param creationDate
 * @param fileName
 * @param modificationDate
 * @param parameters
 * @param readDate
 * @param propertySize
 * @param type
 */

@Serializable
data class ContentDisposition(

    @Contextual
    val creationDate: java.time.OffsetDateTime? = null,

    val fileName: kotlin.String? = null,

    @Contextual
    val modificationDate: java.time.OffsetDateTime? = null,

    val parameters: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Contextual
    val readDate: java.time.OffsetDateTime? = null,

    val propertySize: kotlin.Long? = null,

    val type: kotlin.String? = null

)

