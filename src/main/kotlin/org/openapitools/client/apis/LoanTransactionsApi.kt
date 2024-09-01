package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetLoansLoanIdTransactionsTemplateResponse
import org.openapitools.client.models.GetLoansLoanIdTransactionsTransactionIdResponse
import org.openapitools.client.models.PostLoansLoanIdTransactionsRequest
import org.openapitools.client.models.PostLoansLoanIdTransactionsResponse
import org.openapitools.client.models.PostLoansLoanIdTransactionsTransactionIdRequest
import org.openapitools.client.models.PutChargeTransactionChangesRequest
import org.openapitools.client.models.PutChargeTransactionChangesResponse

interface LoanTransactionsApi {
    /**
     * Adjust a Transaction
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param transactionId transactionId
     * @param postLoansLoanIdTransactionsTransactionIdRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdTransactionsResponse]
     */
    @POST("v1/loans/{loanId}/transactions/{transactionId}")
    suspend fun adjustLoanTransaction(@Path("loanId") loanId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long, @Body postLoansLoanIdTransactionsTransactionIdRequest: PostLoansLoanIdTransactionsTransactionIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdTransactionsResponse>

    /**
     * Adjust a Transaction
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param externalTransactionId externalTransactionId
     * @param postLoansLoanIdTransactionsTransactionIdRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdTransactionsResponse]
     */
    @POST("v1/loans/{loanId}/transactions/external-id/{externalTransactionId}")
    suspend fun adjustLoanTransaction1(@Path("loanId") loanId: kotlin.Long, @Path("externalTransactionId") externalTransactionId: kotlin.String, @Body postLoansLoanIdTransactionsTransactionIdRequest: PostLoansLoanIdTransactionsTransactionIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdTransactionsResponse>

    /**
     * Adjust a Transaction
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param transactionId transactionId
     * @param postLoansLoanIdTransactionsTransactionIdRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdTransactionsResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/transactions/{transactionId}")
    suspend fun adjustLoanTransaction2(@Path("loanExternalId") loanExternalId: kotlin.String, @Path("transactionId") transactionId: kotlin.Long, @Body postLoansLoanIdTransactionsTransactionIdRequest: PostLoansLoanIdTransactionsTransactionIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdTransactionsResponse>

    /**
     * Adjust a Transaction
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param externalTransactionId externalTransactionId
     * @param postLoansLoanIdTransactionsTransactionIdRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdTransactionsResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/transactions/external-id/{externalTransactionId}")
    suspend fun adjustLoanTransaction3(@Path("loanExternalId") loanExternalId: kotlin.String, @Path("externalTransactionId") externalTransactionId: kotlin.String, @Body postLoansLoanIdTransactionsTransactionIdRequest: PostLoansLoanIdTransactionsTransactionIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdTransactionsResponse>

    /**
     * Significant Loan Transactions
     * This API covers the major loan transaction functionality  Example Requests:  loans/1/transactions?command&#x3D;repayment | Make a Repayment |  loans/1/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/1/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/1/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/1/transactions?command&#x3D;chargeRefund | Charge Refund |  loans/1/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/1/transactions?command&#x3D;writeoff | Write-off Loan |  loans/1/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/1/transactions?command&#x3D;close | Close Loan |  loans/1/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/1/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/1/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/1/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/1/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;charge-off | Charge-off Loan |   loans/1/transactions?command&#x3D;downPayment | Down Payment |   
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansLoanIdTransactionsRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdTransactionsResponse]
     */
    @POST("v1/loans/{loanId}/transactions")
    suspend fun executeLoanTransaction(@Path("loanId") loanId: kotlin.Long, @Body postLoansLoanIdTransactionsRequest: PostLoansLoanIdTransactionsRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdTransactionsResponse>

    /**
     * Significant Loan Transactions
     * This API covers the major loan transaction functionality  Example Requests:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;repayment | Make a Repayment |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;chargeRefund | Charge Refund |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;writeoff | Write-off Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;close | Close Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;charge-off | Charge-off Loan |   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;downPayment | Down Payment |   
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param postLoansLoanIdTransactionsRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdTransactionsResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/transactions")
    suspend fun executeLoanTransaction1(@Path("loanExternalId") loanExternalId: kotlin.String, @Body postLoansLoanIdTransactionsRequest: PostLoansLoanIdTransactionsRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdTransactionsResponse>

    /**
     * Retrieve a Transaction Details
     * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param transactionId transactionId
     * @param fields Optional Loan Transaction attribute list to be in the response (optional)
     * @return [GetLoansLoanIdTransactionsTransactionIdResponse]
     */
    @GET("v1/loans/{loanId}/transactions/{transactionId}")
    suspend fun retrieveTransaction(@Path("loanId") loanId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long, @Query("fields") fields: kotlin.String? = null): Response<GetLoansLoanIdTransactionsTransactionIdResponse>

    /**
     * Retrieve a Transaction Details
     * Retrieves a Transaction Details  Example Request:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/external-id/5dd80a7c-ccba-4446-b378-01eb6f53e871
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param externalTransactionId externalTransactionId
     * @param fields Optional Loan Transaction attribute list to be in the response (optional)
     * @return [GetLoansLoanIdTransactionsTransactionIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/transactions/external-id/{externalTransactionId}")
    suspend fun retrieveTransactionByLoanExternalIdAndTransactionExternalId(@Path("loanExternalId") loanExternalId: kotlin.String, @Path("externalTransactionId") externalTransactionId: kotlin.String, @Query("fields") fields: kotlin.String? = null): Response<GetLoansLoanIdTransactionsTransactionIdResponse>

    /**
     * Retrieve a Transaction Details
     * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param transactionId transactionId
     * @param fields Optional Loan Transaction attribute list to be in the response (optional)
     * @return [GetLoansLoanIdTransactionsTransactionIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/transactions/{transactionId}")
    suspend fun retrieveTransactionByLoanExternalIdAndTransactionId(@Path("loanExternalId") loanExternalId: kotlin.String, @Path("transactionId") transactionId: kotlin.Long, @Query("fields") fields: kotlin.String? = null): Response<GetLoansLoanIdTransactionsTransactionIdResponse>

    /**
     * Retrieve a Transaction Details
     * Retrieves a Transaction Details  Example Request:  loans/5/transactions/external-id/5dd80a7c-ccba-4446-b378-01eb6f53e871
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param externalTransactionId externalTransactionId
     * @param fields Optional Loan Transaction attribute list to be in the response (optional)
     * @return [GetLoansLoanIdTransactionsTransactionIdResponse]
     */
    @GET("v1/loans/{loanId}/transactions/external-id/{externalTransactionId}")
    suspend fun retrieveTransactionByTransactionExternalId(@Path("loanId") loanId: kotlin.Long, @Path("externalTransactionId") externalTransactionId: kotlin.String, @Query("fields") fields: kotlin.String? = null): Response<GetLoansLoanIdTransactionsTransactionIdResponse>

    /**
     * Retrieve Loan Transaction Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value) loans/1/transactions/template?command&#x3D;charge-off loans/1/transactions/template?command&#x3D;downPayment 
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param command command (optional)
     * @param dateFormat dateFormat (optional)
     * @param transactionDate transactionDate (optional)
     * @param locale locale (optional)
     * @return [GetLoansLoanIdTransactionsTemplateResponse]
     */
    @GET("v1/loans/{loanId}/transactions/template")
    suspend fun retrieveTransactionTemplate(@Path("loanId") loanId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Query("dateFormat") dateFormat: kotlin.String? = null, @Query("transactionDate") transactionDate: kotlin.Any? = null, @Query("locale") locale: kotlin.String? = null): Response<GetLoansLoanIdTransactionsTemplateResponse>

    /**
     * Retrieve Loan Transaction Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value) loans/1/transactions/template?command&#x3D;charge-off loans/1/transactions/template?command&#x3D;downPayment 
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param command command (optional)
     * @param dateFormat dateFormat (optional)
     * @param transactionDate transactionDate (optional)
     * @param locale locale (optional)
     * @return [GetLoansLoanIdTransactionsTemplateResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/transactions/template")
    suspend fun retrieveTransactionTemplate1(@Path("loanExternalId") loanExternalId: kotlin.String, @Query("command") command: kotlin.String? = null, @Query("dateFormat") dateFormat: kotlin.String? = null, @Query("transactionDate") transactionDate: kotlin.Any? = null, @Query("locale") locale: kotlin.String? = null): Response<GetLoansLoanIdTransactionsTemplateResponse>

    /**
     * Undo a Waive Charge Transaction
     * Undo a Waive Charge Transaction
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param transactionId transactionId
     * @param putChargeTransactionChangesRequest 
     * @return [PutChargeTransactionChangesResponse]
     */
    @PUT("v1/loans/{loanId}/transactions/{transactionId}")
    suspend fun undoWaiveCharge(@Path("loanId") loanId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long, @Body putChargeTransactionChangesRequest: PutChargeTransactionChangesRequest): Response<PutChargeTransactionChangesResponse>

    /**
     * Undo a Waive Charge Transaction
     * Undo a Waive Charge Transaction
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param transactionExternalId transactionExternalId
     * @param putChargeTransactionChangesRequest 
     * @return [PutChargeTransactionChangesResponse]
     */
    @PUT("v1/loans/{loanId}/transactions/external-id/{transactionExternalId}")
    suspend fun undoWaiveCharge1(@Path("loanId") loanId: kotlin.Long, @Path("transactionExternalId") transactionExternalId: kotlin.String, @Body putChargeTransactionChangesRequest: PutChargeTransactionChangesRequest): Response<PutChargeTransactionChangesResponse>

    /**
     * Undo a Waive Charge Transaction
     * Undo a Waive Charge Transaction
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param transactionId transactionId
     * @param putChargeTransactionChangesRequest 
     * @return [PutChargeTransactionChangesResponse]
     */
    @PUT("v1/loans/external-id/{loanExternalId}/transactions/{transactionId}")
    suspend fun undoWaiveCharge2(@Path("loanExternalId") loanExternalId: kotlin.String, @Path("transactionId") transactionId: kotlin.Long, @Body putChargeTransactionChangesRequest: PutChargeTransactionChangesRequest): Response<PutChargeTransactionChangesResponse>

    /**
     * Undo a Waive Charge Transaction
     * Undo a Waive Charge Transaction
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param transactionExternalId transactionExternalId
     * @param putChargeTransactionChangesRequest 
     * @return [PutChargeTransactionChangesResponse]
     */
    @PUT("v1/loans/external-id/{loanExternalId}/transactions/external-id/{transactionExternalId}")
    suspend fun undoWaiveCharge3(@Path("loanExternalId") loanExternalId: kotlin.String, @Path("transactionExternalId") transactionExternalId: kotlin.String, @Body putChargeTransactionChangesRequest: PutChargeTransactionChangesRequest): Response<PutChargeTransactionChangesResponse>

}
