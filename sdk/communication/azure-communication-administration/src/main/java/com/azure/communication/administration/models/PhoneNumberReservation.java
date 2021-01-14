// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The PhoneNumberReservation model. */
@Fluent
public final class PhoneNumberReservation {
    /*
     * The id of the search.
     */
    @JsonProperty(value = "searchId")
    private String reservationId;

    /*
     * The name of the search.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The creation time of the search.
     */
    @JsonProperty(value = "createdAt")
    private OffsetDateTime createdAt;

    /*
     * The description of the search.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The phone plan ids of the search.
     */
    @JsonProperty(value = "phonePlanIds")
    private List<String> phonePlanIds;

    /*
     * The area code of the search.
     */
    @JsonProperty(value = "areaCode")
    private String areaCode;

    /*
     * The quantity of phone numbers in the search.
     */
    @JsonProperty(value = "quantity")
    private Integer quantity;

    /*
     * The location options of the search.
     */
    @JsonProperty(value = "locationOptions")
    private List<LocationOptionsDetails> locationOptions;

    /*
     * The status of the search.
     */
    @JsonProperty(value = "status")
    private SearchStatus status;

    /*
     * The list of phone numbers in the search, in the case the status is
     * reserved or success.
     */
    @JsonProperty(value = "phoneNumbers")
    private List<String> phoneNumbers;

    /*
     * The date that search expires and the numbers become available.
     */
    @JsonProperty(value = "reservationExpiryDate")
    private OffsetDateTime reservationExpiryDate;

    /*
     * The error code of the search.
     */
    @JsonProperty(value = "errorCode")
    private Integer errorCode;

    /**
     * Get the reservationId property: The id of the search.
     *
     * @return the reservationId value.
     */
    public String getReservationId() {
        return this.reservationId;
    }

    /**
     * Set the reservationId property: The id of the search.
     *
     * @param reservationId the reservationId value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    /**
     * Get the displayName property: The name of the search.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the search.
     *
     * @param displayName the displayName value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the createdAt property: The creation time of the search.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The creation time of the search.
     *
     * @param createdAt the createdAt value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the description property: The description of the search.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the search.
     *
     * @param description the description value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the phonePlanIds property: The phone plan ids of the search.
     *
     * @return the phonePlanIds value.
     */
    public List<String> getPhonePlanIds() {
        return this.phonePlanIds;
    }

    /**
     * Set the phonePlanIds property: The phone plan ids of the search.
     *
     * @param phonePlanIds the phonePlanIds value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setPhonePlanIds(List<String> phonePlanIds) {
        this.phonePlanIds = phonePlanIds;
        return this;
    }

    /**
     * Get the areaCode property: The area code of the search.
     *
     * @return the areaCode value.
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * Set the areaCode property: The area code of the search.
     *
     * @param areaCode the areaCode value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Get the quantity property: The quantity of phone numbers in the search.
     *
     * @return the quantity value.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The quantity of phone numbers in the search.
     *
     * @param quantity the quantity value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the locationOptions property: The location options of the search.
     *
     * @return the locationOptions value.
     */
    public List<LocationOptionsDetails> getLocationOptions() {
        return this.locationOptions;
    }

    /**
     * Set the locationOptions property: The location options of the search.
     *
     * @param locationOptions the locationOptions value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setLocationOptions(List<LocationOptionsDetails> locationOptions) {
        this.locationOptions = locationOptions;
        return this;
    }

    /**
     * Get the status property: The status of the search.
     *
     * @return the status value.
     */
    public SearchStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the search.
     *
     * @param status the status value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setStatus(SearchStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the phoneNumbers property: The list of phone numbers in the search, in the case the status is reserved or
     * success.
     *
     * @return the phoneNumbers value.
     */
    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: The list of phone numbers in the search, in the case the status is reserved or
     * success.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Get the reservationExpiryDate property: The date that search expires and the numbers become available.
     *
     * @return the reservationExpiryDate value.
     */
    public OffsetDateTime getReservationExpiryDate() {
        return this.reservationExpiryDate;
    }

    /**
     * Set the reservationExpiryDate property: The date that search expires and the numbers become available.
     *
     * @param reservationExpiryDate the reservationExpiryDate value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setReservationExpiryDate(OffsetDateTime reservationExpiryDate) {
        this.reservationExpiryDate = reservationExpiryDate;
        return this;
    }

    /**
     * Get the errorCode property: The error code of the search.
     *
     * @return the errorCode value.
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The error code of the search.
     *
     * @param errorCode the errorCode value to set.
     * @return the PhoneNumberReservation object itself.
     */
    public PhoneNumberReservation setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
