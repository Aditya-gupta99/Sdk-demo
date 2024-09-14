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
 * @param id
 * @param mandatoryGuarantee
 * @param minimumGuaranteeFromGuarantor
 * @param minimumGuaranteeFromOwnFunds
 * @param new
 */

@Serializable
data class LoanProductGuaranteeDetails(

    val id: kotlin.Long? = null,

    @Contextual
    val mandatoryGuarantee: java.math.BigDecimal? = null,

    @Contextual
    val minimumGuaranteeFromGuarantor: java.math.BigDecimal? = null,

    @Contextual
    val minimumGuaranteeFromOwnFunds: java.math.BigDecimal? = null,

    val new: kotlin.Boolean? = null

)

