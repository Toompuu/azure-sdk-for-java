// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.Channels;
import com.azure.resourcemanager.appservice.models.NotificationLevel;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.ResourceScopeType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Represents a recommendation result generated by the recommendation engine. */
@Fluent
public final class RecommendationInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendationInner.class);

    /*
     * Recommendation resource specific properties
     */
    @JsonProperty(value = "properties")
    private RecommendationProperties innerProperties;

    /**
     * Get the innerProperties property: Recommendation resource specific properties.
     *
     * @return the innerProperties value.
     */
    private RecommendationProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RecommendationInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the creationTime property: Timestamp when this instance was created.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Set the creationTime property: Timestamp when this instance was created.
     *
     * @param creationTime the creationTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withCreationTime(OffsetDateTime creationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withCreationTime(creationTime);
        return this;
    }

    /**
     * Get the recommendationId property: A GUID value that each recommendation object is associated with.
     *
     * @return the recommendationId value.
     */
    public UUID recommendationId() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationId();
    }

    /**
     * Set the recommendationId property: A GUID value that each recommendation object is associated with.
     *
     * @param recommendationId the recommendationId value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRecommendationId(UUID recommendationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withRecommendationId(recommendationId);
        return this;
    }

    /**
     * Get the resourceId property: Full ARM resource ID string that this recommendation object is associated with.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: Full ARM resource ID string that this recommendation object is associated with.
     *
     * @param resourceId the resourceId value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the resourceScope property: Name of a resource type this recommendation applies, e.g. Subscription,
     * ServerFarm, Site.
     *
     * @return the resourceScope value.
     */
    public ResourceScopeType resourceScope() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceScope();
    }

    /**
     * Set the resourceScope property: Name of a resource type this recommendation applies, e.g. Subscription,
     * ServerFarm, Site.
     *
     * @param resourceScope the resourceScope value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceScope(ResourceScopeType resourceScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withResourceScope(resourceScope);
        return this;
    }

    /**
     * Get the ruleName property: Unique name of the rule.
     *
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleName();
    }

    /**
     * Set the ruleName property: Unique name of the rule.
     *
     * @param ruleName the ruleName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRuleName(String ruleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withRuleName(ruleName);
        return this;
    }

    /**
     * Get the displayName property: UI friendly name of the rule (may not be unique).
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: UI friendly name of the rule (may not be unique).
     *
     * @param displayName the displayName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the message property: Recommendation text.
     *
     * @return the message value.
     */
    public String message() {
        return this.innerProperties() == null ? null : this.innerProperties().message();
    }

    /**
     * Set the message property: Recommendation text.
     *
     * @param message the message value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withMessage(String message) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withMessage(message);
        return this;
    }

    /**
     * Get the level property: Level indicating how critical this recommendation can impact.
     *
     * @return the level value.
     */
    public NotificationLevel level() {
        return this.innerProperties() == null ? null : this.innerProperties().level();
    }

    /**
     * Set the level property: Level indicating how critical this recommendation can impact.
     *
     * @param level the level value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withLevel(NotificationLevel level) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withLevel(level);
        return this;
    }

    /**
     * Get the channels property: List of channels that this recommendation can apply.
     *
     * @return the channels value.
     */
    public Channels channels() {
        return this.innerProperties() == null ? null : this.innerProperties().channels();
    }

    /**
     * Set the channels property: List of channels that this recommendation can apply.
     *
     * @param channels the channels value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withChannels(Channels channels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withChannels(channels);
        return this;
    }

    /**
     * Get the categoryTags property: The list of category tags that this recommendation belongs to.
     *
     * @return the categoryTags value.
     */
    public List<String> categoryTags() {
        return this.innerProperties() == null ? null : this.innerProperties().categoryTags();
    }

    /**
     * Get the actionName property: Name of action recommended by this object.
     *
     * @return the actionName value.
     */
    public String actionName() {
        return this.innerProperties() == null ? null : this.innerProperties().actionName();
    }

    /**
     * Set the actionName property: Name of action recommended by this object.
     *
     * @param actionName the actionName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withActionName(String actionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withActionName(actionName);
        return this;
    }

    /**
     * Get the enabled property: True if this recommendation is still valid (i.e. "actionable"). False if it is invalid.
     *
     * @return the enabled value.
     */
    public Integer enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: True if this recommendation is still valid (i.e. "actionable"). False if it is invalid.
     *
     * @param enabled the enabled value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEnabled(Integer enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the states property: The list of states of this recommendation. If it's null then it should be considered
     * "Active".
     *
     * @return the states value.
     */
    public List<String> states() {
        return this.innerProperties() == null ? null : this.innerProperties().states();
    }

    /**
     * Set the states property: The list of states of this recommendation. If it's null then it should be considered
     * "Active".
     *
     * @param states the states value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withStates(List<String> states) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withStates(states);
        return this;
    }

    /**
     * Get the startTime property: The beginning time in UTC of a range that the recommendation refers to.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: The beginning time in UTC of a range that the recommendation refers to.
     *
     * @param startTime the startTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: The end time in UTC of a range that the recommendation refers to.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: The end time in UTC of a range that the recommendation refers to.
     *
     * @param endTime the endTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the nextNotificationTime property: When to notify this recommendation next in UTC. Null means that this will
     * never be notified anymore.
     *
     * @return the nextNotificationTime value.
     */
    public OffsetDateTime nextNotificationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().nextNotificationTime();
    }

    /**
     * Set the nextNotificationTime property: When to notify this recommendation next in UTC. Null means that this will
     * never be notified anymore.
     *
     * @param nextNotificationTime the nextNotificationTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNextNotificationTime(OffsetDateTime nextNotificationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withNextNotificationTime(nextNotificationTime);
        return this;
    }

    /**
     * Get the notificationExpirationTime property: Date and time in UTC when this notification expires.
     *
     * @return the notificationExpirationTime value.
     */
    public OffsetDateTime notificationExpirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().notificationExpirationTime();
    }

    /**
     * Set the notificationExpirationTime property: Date and time in UTC when this notification expires.
     *
     * @param notificationExpirationTime the notificationExpirationTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotificationExpirationTime(OffsetDateTime notificationExpirationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withNotificationExpirationTime(notificationExpirationTime);
        return this;
    }

    /**
     * Get the notifiedTime property: Last timestamp in UTC this instance was actually notified. Null means that this
     * recommendation hasn't been notified yet.
     *
     * @return the notifiedTime value.
     */
    public OffsetDateTime notifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().notifiedTime();
    }

    /**
     * Set the notifiedTime property: Last timestamp in UTC this instance was actually notified. Null means that this
     * recommendation hasn't been notified yet.
     *
     * @param notifiedTime the notifiedTime value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotifiedTime(OffsetDateTime notifiedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withNotifiedTime(notifiedTime);
        return this;
    }

    /**
     * Get the score property: A metric value measured by the rule.
     *
     * @return the score value.
     */
    public Double score() {
        return this.innerProperties() == null ? null : this.innerProperties().score();
    }

    /**
     * Set the score property: A metric value measured by the rule.
     *
     * @param score the score value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withScore(Double score) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withScore(score);
        return this;
    }

    /**
     * Get the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @return the isDynamic value.
     */
    public Boolean isDynamic() {
        return this.innerProperties() == null ? null : this.innerProperties().isDynamic();
    }

    /**
     * Set the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @param isDynamic the isDynamic value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withIsDynamic(Boolean isDynamic) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withIsDynamic(isDynamic);
        return this;
    }

    /**
     * Get the extensionName property: Extension name of the portal if exists.
     *
     * @return the extensionName value.
     */
    public String extensionName() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionName();
    }

    /**
     * Set the extensionName property: Extension name of the portal if exists.
     *
     * @param extensionName the extensionName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withExtensionName(String extensionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withExtensionName(extensionName);
        return this;
    }

    /**
     * Get the bladeName property: Deep link to a blade on the portal.
     *
     * @return the bladeName value.
     */
    public String bladeName() {
        return this.innerProperties() == null ? null : this.innerProperties().bladeName();
    }

    /**
     * Set the bladeName property: Deep link to a blade on the portal.
     *
     * @param bladeName the bladeName value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withBladeName(String bladeName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withBladeName(bladeName);
        return this;
    }

    /**
     * Get the forwardLink property: Forward link to an external document associated with the rule.
     *
     * @return the forwardLink value.
     */
    public String forwardLink() {
        return this.innerProperties() == null ? null : this.innerProperties().forwardLink();
    }

    /**
     * Set the forwardLink property: Forward link to an external document associated with the rule.
     *
     * @param forwardLink the forwardLink value to set.
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withForwardLink(String forwardLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationProperties();
        }
        this.innerProperties().withForwardLink(forwardLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
