// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientCertificateWithCsrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientCertificateWithCsrResponseBody</p>
 */
public class CreateClientCertificateWithCsrResponseBody extends TeaModel {
    @NameInMap("CertificateChain")
    private String certificateChain;

    @NameInMap("Identifier")
    private String identifier;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SerialNumber")
    private String serialNumber;

    @NameInMap("X509Certificate")
    private String x509Certificate;

    private CreateClientCertificateWithCsrResponseBody(Builder builder) {
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientCertificateWithCsrResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateChain
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder {
        private String certificateChain; 
        private String identifier; 
        private String requestId; 
        private String serialNumber; 
        private String x509Certificate; 

        /**
         * The serial number of the server certificate.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * 0f29522da2dae7a1c4b6ab7132ad3c06
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * The unique identifier of the client certificate.
         */
        public Builder x509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public CreateClientCertificateWithCsrResponseBody build() {
            return new CreateClientCertificateWithCsrResponseBody(this);
        } 

    } 

}
