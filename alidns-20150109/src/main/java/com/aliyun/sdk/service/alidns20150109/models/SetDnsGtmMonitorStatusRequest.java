// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDnsGtmMonitorStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDnsGtmMonitorStatusRequest</p>
 */
public class SetDnsGtmMonitorStatusRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    private String monitorConfigId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private SetDnsGtmMonitorStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.monitorConfigId = builder.monitorConfigId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDnsGtmMonitorStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return monitorConfigId
     */
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetDnsGtmMonitorStatusRequest, Builder> {
        private String lang; 
        private String monitorConfigId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetDnsGtmMonitorStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.monitorConfigId = request.monitorConfigId;
            this.status = request.status;
        } 

        /**
         * The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the health check task.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.putQueryParameter("MonitorConfigId", monitorConfigId);
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * Specifies whether to enable the health check feature. Valid values:
         * <p>
         * 
         * *   OPEN: enable
         * *   CLOSE: disable
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetDnsGtmMonitorStatusRequest build() {
            return new SetDnsGtmMonitorStatusRequest(this);
        } 

    } 

}
