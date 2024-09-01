package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteLoansLoanIdResponse
import org.openapitools.client.models.GetDelinquencyActionsResponse
import org.openapitools.client.models.GetDelinquencyTagHistoryResponse
import org.openapitools.client.models.GetLoansApprovalTemplateResponse
import org.openapitools.client.models.GetLoansLoanIdResponse
import org.openapitools.client.models.GetLoansResponse
import org.openapitools.client.models.GetLoansTemplateResponse
import org.openapitools.client.models.PostLoansDelinquencyActionRequest
import org.openapitools.client.models.PostLoansDelinquencyActionResponse
import org.openapitools.client.models.PostLoansLoanIdRequest
import org.openapitools.client.models.PostLoansLoanIdResponse
import org.openapitools.client.models.PostLoansRequest
import org.openapitools.client.models.PostLoansResponse
import org.openapitools.client.models.PutLoansLoanIdRequest
import org.openapitools.client.models.PutLoansLoanIdResponse

import okhttp3.MultipartBody

interface LoansApi {
    /**
     * Calculate loan repayment schedule | Submit a new Loan Application
     * It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables
     * Responses:
     *  - 200: OK
     *
     * @param postLoansRequest 
     * @param command command (optional)
     * @return [PostLoansResponse]
     */
    @POST("v1/loans")
    suspend fun calculateLoanScheduleOrSubmitLoanApplication(@Body postLoansRequest: PostLoansRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansResponse>

    /**
     * Adds a new delinquency action for a loan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansDelinquencyActionRequest 
     * @return [PostLoansDelinquencyActionResponse]
     */
    @POST("v1/loans/{loanId}/delinquency-actions")
    suspend fun createLoanDelinquencyAction(@Path("loanId") loanId: kotlin.Long, @Body postLoansDelinquencyActionRequest: PostLoansDelinquencyActionRequest): Response<PostLoansDelinquencyActionResponse>

    /**
     * Adds a new delinquency action for a loan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param postLoansDelinquencyActionRequest 
     * @return [PostLoansDelinquencyActionResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/delinquency-actions")
    suspend fun createLoanDelinquencyAction1(@Path("loanExternalId") loanExternalId: kotlin.String, @Body postLoansDelinquencyActionRequest: PostLoansDelinquencyActionRequest): Response<PostLoansDelinquencyActionResponse>

    /**
     * Delete a Loan Application
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [DeleteLoansLoanIdResponse]
     */
    @DELETE("v1/loans/{loanId}")
    suspend fun deleteLoanApplication(@Path("loanId") loanId: kotlin.Long): Response<DeleteLoansLoanIdResponse>

    /**
     * Delete a Loan Application
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [DeleteLoansLoanIdResponse]
     */
    @DELETE("v1/loans/external-id/{loanExternalId}")
    suspend fun deleteLoanApplication1(@Path("loanExternalId") loanExternalId: kotlin.String): Response<DeleteLoansLoanIdResponse>

    /**
     * Retrieve the Loan Delinquency Tag history using the Loan Id
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetDelinquencyTagHistoryResponse>]
     */
    @GET("v1/loans/{loanId}/delinquencytags")
    suspend fun getDelinquencyTagHistory(@Path("loanId") loanId: kotlin.Long): Response<kotlin.collections.List<GetDelinquencyTagHistoryResponse>>

    /**
     * Retrieve the Loan Delinquency Tag history using the Loan Id
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [kotlin.collections.List<GetDelinquencyTagHistoryResponse>]
     */
    @GET("v1/loans/external-id/{loanExternalId}/delinquencytags")
    suspend fun getDelinquencyTagHistory1(@Path("loanExternalId") loanExternalId: kotlin.String): Response<kotlin.collections.List<GetDelinquencyTagHistoryResponse>>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param glimId 
     * @return [kotlin.String]
     */
    @GET("v1/loans/glimAccount/{glimId}")
    suspend fun getGlimRepaymentTemplate(@Path("glimId") glimId: kotlin.Long): Response<kotlin.String>

    /**
     * Retrieve delinquency actions related to the loan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetDelinquencyActionsResponse>]
     */
    @GET("v1/loans/{loanId}/delinquency-actions")
    suspend fun getLoanDelinquencyActions(@Path("loanId") loanId: kotlin.Long): Response<kotlin.collections.List<GetDelinquencyActionsResponse>>

    /**
     * Retrieve delinquency actions related to the loan
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [kotlin.collections.List<GetDelinquencyActionsResponse>]
     */
    @GET("v1/loans/external-id/{loanExternalId}/delinquency-actions")
    suspend fun getLoanDelinquencyActions1(@Path("loanExternalId") loanExternalId: kotlin.String): Response<kotlin.collections.List<GetDelinquencyActionsResponse>>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/loans/repayments/downloadtemplate")
    suspend fun getLoanRepaymentTemplate(@Query("officeId") officeId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/loans/downloadtemplate")
    suspend fun getLoansTemplate(@Query("officeId") officeId: kotlin.Long? = null, @Query("staffId") staffId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * Approve GLIM Application | Undo GLIM Application Approval | Reject GLIM Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve GLIM Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the GLIM application  Undo GLIM Application Approval: Undoes the GLIM Application Approval  Reject GLIM Application: Mandatory Fields: rejectedOnDate Allows you to reject the GLIM application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal 
     * Responses:
     *  - 200: OK
     *
     * @param glimId 
     * @param postLoansLoanIdRequest 
     * @param command  (optional)
     * @return [PostLoansLoanIdResponse]
     */
    @POST("v1/loans/glimAccount/{glimId}")
    suspend fun glimStateTransitions(@Path("glimId") glimId: kotlin.Long, @Body postLoansLoanIdRequest: PostLoansLoanIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdResponse>

    /**
     * Modify a loan application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param putLoansLoanIdRequest 
     * @param command command (optional)
     * @return [PutLoansLoanIdResponse]
     */
    @PUT("v1/loans/{loanId}")
    suspend fun modifyLoanApplication(@Path("loanId") loanId: kotlin.Long, @Body putLoansLoanIdRequest: PutLoansLoanIdRequest, @Query("command") command: kotlin.String? = null): Response<PutLoansLoanIdResponse>

    /**
     * Modify a loan application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param putLoansLoanIdRequest 
     * @param command command (optional)
     * @return [PutLoansLoanIdResponse]
     */
    @PUT("v1/loans/external-id/{loanExternalId}")
    suspend fun modifyLoanApplication1(@Path("loanExternalId") loanExternalId: kotlin.String, @Body putLoansLoanIdRequest: PutLoansLoanIdRequest, @Query("command") command: kotlin.String? = null): Response<PutLoansLoanIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/loans/repayments/uploadtemplate")
    suspend fun postLoanRepaymentTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/loans/uploadtemplate")
    suspend fun postLoanTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * List Loans
     * The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param accountNo accountNo (optional)
     * @param status status (optional)
     * @return [GetLoansResponse]
     */
    @GET("v1/loans")
    suspend fun retrieveAll27(@Query("externalId") externalId: kotlin.String? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("accountNo") accountNo: kotlin.String? = null, @Query("status") status: kotlin.String? = null): Response<GetLoansResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param templateType templateType (optional)
     * @return [GetLoansApprovalTemplateResponse]
     */
    @GET("v1/loans/{loanId}/template")
    suspend fun retrieveApprovalTemplate(@Path("loanId") loanId: kotlin.Long, @Query("templateType") templateType: kotlin.String? = null): Response<GetLoansApprovalTemplateResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param templateType templateType (optional)
     * @return [GetLoansApprovalTemplateResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/template")
    suspend fun retrieveApprovalTemplate1(@Path("loanExternalId") loanExternalId: kotlin.String, @Query("templateType") templateType: kotlin.String? = null): Response<GetLoansApprovalTemplateResponse>

    /**
     * Retrieve a Loan
     * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param associations Loan object relations to be included in the response (optional, default to "all")
     * @param exclude Optional Loan object relation list to be filtered in the response (optional)
     * @param fields Optional Loan attribute list to be in the response (optional)
     * @return [GetLoansLoanIdResponse]
     */
    @GET("v1/loans/{loanId}")
    suspend fun retrieveLoan(@Path("loanId") loanId: kotlin.Long, @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: kotlin.Boolean? = false, @Query("associations") associations: kotlin.String? = "all", @Query("exclude") exclude: kotlin.String? = null, @Query("fields") fields: kotlin.String? = null): Response<GetLoansLoanIdResponse>

    /**
     * Retrieve a Loan
     * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,principal,annualInterestRate   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?associations&#x3D;all  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param associations Loan object relations to be included in the response (optional, default to "all")
     * @param exclude Optional Loan object relation list to be filtered in the response (optional)
     * @param fields Optional Loan attribute list to be in the response (optional)
     * @return [GetLoansLoanIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}")
    suspend fun retrieveLoan1(@Path("loanExternalId") loanExternalId: kotlin.String, @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: kotlin.Boolean? = false, @Query("associations") associations: kotlin.String? = "all", @Query("exclude") exclude: kotlin.String? = null, @Query("fields") fields: kotlin.String? = null): Response<GetLoansLoanIdResponse>

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansLoanIdRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdResponse]
     */
    @POST("v1/loans/{loanId}")
    suspend fun stateTransitions(@Path("loanId") loanId: kotlin.Long, @Body postLoansLoanIdRequest: PostLoansLoanIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdResponse>

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param postLoansLoanIdRequest 
     * @param command command (optional)
     * @return [PostLoansLoanIdResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}")
    suspend fun stateTransitions1(@Path("loanExternalId") loanExternalId: kotlin.String, @Body postLoansLoanIdRequest: PostLoansLoanIdRequest, @Query("command") command: kotlin.String? = null): Response<PostLoansLoanIdResponse>

    /**
     * Retrieve Loan Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param groupId groupId (optional)
     * @param productId productId (optional)
     * @param templateType templateType (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param activeOnly activeOnly (optional, default to false)
     * @return [GetLoansTemplateResponse]
     */
    @GET("v1/loans/template")
    suspend fun template10(@Query("clientId") clientId: kotlin.Long? = null, @Query("groupId") groupId: kotlin.Long? = null, @Query("productId") productId: kotlin.Long? = null, @Query("templateType") templateType: kotlin.String? = null, @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: kotlin.Boolean? = false, @Query("activeOnly") activeOnly: kotlin.Boolean? = false): Response<GetLoansTemplateResponse>

}
