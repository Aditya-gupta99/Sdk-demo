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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountId
 * @param amount
 * @param amountType
 * @param quoteCode
 * @param transactionCode
 * @param transactionRole
 * @param expiration
 * @param expirationLocalDate
 * @param extensionList
 * @param fees
 * @param geoCode
 * @param note
 * @param requestCode
 * @param transactionType
 */

@Serializable
data class InteropQuoteRequestData(

    val accountId: kotlin.String,

    val amount: MoneyData,

    val amountType: InteropQuoteRequestData.AmountType,

    val quoteCode: kotlin.String,

    val transactionCode: kotlin.String,

    val transactionRole: InteropQuoteRequestData.TransactionRole,

    @Contextual
    val expiration: java.time.OffsetDateTime? = null,

    @Contextual
    val expirationLocalDate: java.time.LocalDate? = null,

    val extensionList: kotlin.collections.List<ExtensionData>? = null,

    val fees: MoneyData? = null,

    val geoCode: GeoCodeData? = null,

    val note: kotlin.String? = null,

    val requestCode: kotlin.String? = null,

    val transactionType: InteropTransactionTypeData? = null

) {

    /**
     *
     *
     * Values: SEND,RECEIVE
     */
    @JsonClass(generateAdapter = false)
    enum class AmountType(val value: kotlin.String) {
        @Json(name = "SEND")
        SEND("SEND"),

        @Json(name = "RECEIVE")
        RECEIVE("RECEIVE");
    }

    /**
     *
     *
     * Values: PAYER,PAYEE
     */
    @JsonClass(generateAdapter = false)
    enum class TransactionRole(val value: kotlin.String) {
        @Json(name = "PAYER")
        PAYER("PAYER"),

        @Json(name = "PAYEE")
        PAYEE("PAYEE");
    }

}

