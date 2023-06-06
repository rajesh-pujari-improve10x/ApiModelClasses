package com.improve10x.apimodelclassespractice.model;

import com.google.gson.annotations.SerializedName;
import com.improve10x.apimodelclassespractice.model.ClientDetails;
import com.improve10x.apimodelclassespractice.model.CurrentSubtotalPriceSet;
import com.improve10x.apimodelclassespractice.model.LineItem;

import java.util.ArrayList;

public class Shop {

    @SerializedName("_id")
    private String randomId;

    private Integer id;

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @SerializedName("app_id")
    private Integer appId;

    @SerializedName("browser_ip")
    private String browserIp;

    @SerializedName("buyer_accepts_marketing")
    private boolean buyerAcceptsMarketing;

    @SerializedName("cancel_reason")
    private String cancelReason;

    @SerializedName("cancelled_at")
    private String cancelledAt;

    @SerializedName("cart_token")
    private String cartToken;

    @SerializedName("checkout_id")
    private Integer checkoutId;

    @SerializedName("checkout_token")
    private String checkoutToken;

    @SerializedName("client_details")
    private ClientDetails clientDetails;

    @SerializedName("closed_at")
    private String closedAt;

    private boolean confirmed;

    @SerializedName("created_at")
    private String createdAt;

    private String currency;

    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;

    @SerializedName("current_subtotal_price_set")
    private CurrentSubtotalPriceSet currentSubtotalPriceSet;

    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;

    @SerializedName("current_total_discounts_set")
    private CurrentSubtotalPriceSet currentTotalDiscountsSet;

    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;

    @SerializedName("current_total_price")
    private String currentTotalPrice;

    @SerializedName("current_total_price_set")
    private CurrentSubtotalPriceSet currentTotalPriceSet;

    @SerializedName("current_total_tax")
    private String currentTotalTax;

    @SerializedName("current_total_tax_set")
    private CurrentSubtotalPriceSet currentTotalTaxSet;

    @SerializedName("customer_locale")
    private String customerLocale;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("discount_codes")
    private ArrayList<String> discountCodes;

    @SerializedName("estimated_taxes")
    private boolean estimatedTaxes;

    @SerializedName("financial_status")
    private String financialStatus;

    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;

    private String gateway;

    @SerializedName("landing_site")
    private String landingSite;

    @SerializedName("landing_site_ref")
    private String landingSiteRef;

    @SerializedName("location_id")
    private String locationId;

    private String name;

    private String note;

    @SerializedName("note_attributes")
    private ArrayList<String> noteAttributes;

    private Integer number;

    @SerializedName("order_number")
    private Integer orderNumber;

    @SerializedName("order_status_url")
    private String orderStatusUrl;

    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;

    @SerializedName("payment_gateway_names")
    private ArrayList<String> paymentGatewayNames;

    @SerializedName("presentment_currency")
    private String presentmentCurrency;

    @SerializedName("processed_at")
    private String processedAt;

    @SerializedName("processing_method")
    private String processingMethod;

    private String reference;

    @SerializedName("referring_site")
    private String referringSite;

    @SerializedName("source_identifier")
    private String sourceIdentifier;

    @SerializedName("source_name")
    private String sourceName;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("subtotal_price")
    private String subtotalPrice;

    @SerializedName("subtotal_price_set")
    private CurrentSubtotalPriceSet subtotalPriceSet;

    private String tags;

    @SerializedName("taxes_included")
    private String taxesIncluded;

    private String test;

    private String token;

    @SerializedName("total_discounts")
    private String totalDiscounts;

    @SerializedName("total_discounts_set")
    private CurrentSubtotalPriceSet totalDiscountsSet;

    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;

    @SerializedName("total_line_items_price_set")
    private CurrentSubtotalPriceSet totalLineItemsPriceSet;

    @SerializedName("total_outstanding")
    private String totalOutstanding;

    @SerializedName("total_price")
    private String totalPrice;

    @SerializedName("total_price_set")
    private CurrentSubtotalPriceSet totalPriceSet;

    @SerializedName("total_price_usd")
    private String totalPriceUsd;

    @SerializedName("total_shipping_price_set")
    private CurrentSubtotalPriceSet totalShippingPriceSet;

    @SerializedName("total_tax")
    private String totalTax;

    @SerializedName("total_tax_set")
    private CurrentSubtotalPriceSet totalTaxSet;

    @SerializedName("total_tip_received")
    private String totalTipReceived;

    @SerializedName("total_weight")
    private Integer totalWeight;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("discount_applications")
    private ArrayList<String> discountApplications;

    @SerializedName("fulfillments")
    private ArrayList<String> fulfillments;

    @SerializedName("line_items")
    private ArrayList<LineItem> lineItems;

    @SerializedName("payment_terms")
    private String paymentTerms;

    private ArrayList<String> refunds;

    public String getRandomId() {
        return randomId;
    }

    public void setRandomId(String randomId) {
        this.randomId = randomId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public boolean isBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public void setBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCartToken() {
        return cartToken;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    public Integer getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(Integer checkoutId) {
        this.checkoutId = checkoutId;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrentSubtotalPrice() {
        return currentSubtotalPrice;
    }

    public void setCurrentSubtotalPrice(String currentSubtotalPrice) {
        this.currentSubtotalPrice = currentSubtotalPrice;
    }

    public CurrentSubtotalPriceSet getCurrentSubtotalPriceSet() {
        return currentSubtotalPriceSet;
    }

    public void setCurrentSubtotalPriceSet(CurrentSubtotalPriceSet currentSubtotalPriceSet) {
        this.currentSubtotalPriceSet = currentSubtotalPriceSet;
    }

    public String getCurrentTotalDiscounts() {
        return currentTotalDiscounts;
    }

    public void setCurrentTotalDiscounts(String currentTotalDiscounts) {
        this.currentTotalDiscounts = currentTotalDiscounts;
    }

    public CurrentSubtotalPriceSet getCurrentTotalDiscountsSet() {
        return currentTotalDiscountsSet;
    }

    public void setCurrentTotalDiscountsSet(CurrentSubtotalPriceSet currentTotalDiscountsSet) {
        this.currentTotalDiscountsSet = currentTotalDiscountsSet;
    }

    public String getCurrentTotalDutiesSet() {
        return currentTotalDutiesSet;
    }

    public void setCurrentTotalDutiesSet(String currentTotalDutiesSet) {
        this.currentTotalDutiesSet = currentTotalDutiesSet;
    }

    public String getCurrentTotalPrice() {
        return currentTotalPrice;
    }

    public void setCurrentTotalPrice(String currentTotalPrice) {
        this.currentTotalPrice = currentTotalPrice;
    }

    public CurrentSubtotalPriceSet getCurrentTotalPriceSet() {
        return currentTotalPriceSet;
    }

    public void setCurrentTotalPriceSet(CurrentSubtotalPriceSet currentTotalPriceSet) {
        this.currentTotalPriceSet = currentTotalPriceSet;
    }

    public String getCurrentTotalTax() {
        return currentTotalTax;
    }

    public void setCurrentTotalTax(String currentTotalTax) {
        this.currentTotalTax = currentTotalTax;
    }

    public CurrentSubtotalPriceSet getCurrentTotalTaxSet() {
        return currentTotalTaxSet;
    }

    public void setCurrentTotalTaxSet(CurrentSubtotalPriceSet currentTotalTaxSet) {
        this.currentTotalTaxSet = currentTotalTaxSet;
    }

    public String getCustomerLocale() {
        return customerLocale;
    }

    public void setCustomerLocale(String customerLocale) {
        this.customerLocale = customerLocale;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ArrayList<String> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(ArrayList<String> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public boolean isEstimatedTaxes() {
        return estimatedTaxes;
    }

    public void setEstimatedTaxes(boolean estimatedTaxes) {
        this.estimatedTaxes = estimatedTaxes;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite;
    }

    public String getLandingSiteRef() {
        return landingSiteRef;
    }

    public void setLandingSiteRef(String landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ArrayList<String> getNoteAttributes() {
        return noteAttributes;
    }

    public void setNoteAttributes(ArrayList<String> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public String getOriginalTotalDutiesSet() {
        return originalTotalDutiesSet;
    }

    public void setOriginalTotalDutiesSet(String originalTotalDutiesSet) {
        this.originalTotalDutiesSet = originalTotalDutiesSet;
    }

    public ArrayList<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    public void setPaymentGatewayNames(ArrayList<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
    }

    public String getPresentmentCurrency() {
        return presentmentCurrency;
    }

    public void setPresentmentCurrency(String presentmentCurrency) {
        this.presentmentCurrency = presentmentCurrency;
    }

    public String getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferringSite() {
        return referringSite;
    }

    public void setReferringSite(String referringSite) {
        this.referringSite = referringSite;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public CurrentSubtotalPriceSet getSubtotalPriceSet() {
        return subtotalPriceSet;
    }

    public void setSubtotalPriceSet(CurrentSubtotalPriceSet subtotalPriceSet) {
        this.subtotalPriceSet = subtotalPriceSet;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTaxesIncluded() {
        return taxesIncluded;
    }

    public void setTaxesIncluded(String taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public CurrentSubtotalPriceSet getTotalDiscountsSet() {
        return totalDiscountsSet;
    }

    public void setTotalDiscountsSet(CurrentSubtotalPriceSet totalDiscountsSet) {
        this.totalDiscountsSet = totalDiscountsSet;
    }

    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public CurrentSubtotalPriceSet getTotalLineItemsPriceSet() {
        return totalLineItemsPriceSet;
    }

    public void setTotalLineItemsPriceSet(CurrentSubtotalPriceSet totalLineItemsPriceSet) {
        this.totalLineItemsPriceSet = totalLineItemsPriceSet;
    }

    public String getTotalOutstanding() {
        return totalOutstanding;
    }

    public void setTotalOutstanding(String totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public CurrentSubtotalPriceSet getTotalPriceSet() {
        return totalPriceSet;
    }

    public void setTotalPriceSet(CurrentSubtotalPriceSet totalPriceSet) {
        this.totalPriceSet = totalPriceSet;
    }

    public String getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(String totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public CurrentSubtotalPriceSet getTotalShippingPriceSet() {
        return totalShippingPriceSet;
    }

    public void setTotalShippingPriceSet(CurrentSubtotalPriceSet totalShippingPriceSet) {
        this.totalShippingPriceSet = totalShippingPriceSet;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public CurrentSubtotalPriceSet getTotalTaxSet() {
        return totalTaxSet;
    }

    public void setTotalTaxSet(CurrentSubtotalPriceSet totalTaxSet) {
        this.totalTaxSet = totalTaxSet;
    }

    public String getTotalTipReceived() {
        return totalTipReceived;
    }

    public void setTotalTipReceived(String totalTipReceived) {
        this.totalTipReceived = totalTipReceived;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<String> getDiscountApplications() {
        return discountApplications;
    }

    public void setDiscountApplications(ArrayList<String> discountApplications) {
        this.discountApplications = discountApplications;
    }

    public ArrayList<String> getFulfillments() {
        return fulfillments;
    }

    public void setFulfillments(ArrayList<String> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public ArrayList<String> getRefunds() {
        return refunds;
    }

    public void setRefunds(ArrayList<String> refunds) {
        this.refunds = refunds;
    }
}
