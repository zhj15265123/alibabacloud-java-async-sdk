// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpsecServerRequest} extends {@link RequestModel}
 *
 * <p>CreateIpsecServerRequest</p>
 */
public class CreateIpsecServerRequest extends Request {
    @Query
    @NameInMap("ClientIpPool")
    @Validation(required = true)
    private String clientIpPool;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private String dryRun;

    @Query
    @NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @Query
    @NameInMap("IkeConfig")
    private String ikeConfig;

    @Query
    @NameInMap("IpSecServerName")
    @Validation(maxLength = 100)
    private String ipSecServerName;

    @Query
    @NameInMap("IpsecConfig")
    private String ipsecConfig;

    @Query
    @NameInMap("LocalSubnet")
    @Validation(required = true)
    private String localSubnet;

    @Query
    @NameInMap("Psk")
    private String psk;

    @Query
    @NameInMap("PskEnabled")
    private Boolean pskEnabled;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    private String vpnGatewayId;

    private CreateIpsecServerRequest(Builder builder) {
        super(builder);
        this.clientIpPool = builder.clientIpPool;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.effectImmediately = builder.effectImmediately;
        this.ikeConfig = builder.ikeConfig;
        this.ipSecServerName = builder.ipSecServerName;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.psk = builder.psk;
        this.pskEnabled = builder.pskEnabled;
        this.regionId = builder.regionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpsecServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIpPool
     */
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return effectImmediately
     */
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    /**
     * @return ikeConfig
     */
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return ipSecServerName
     */
    public String getIpSecServerName() {
        return this.ipSecServerName;
    }

    /**
     * @return ipsecConfig
     */
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return psk
     */
    public String getPsk() {
        return this.psk;
    }

    /**
     * @return pskEnabled
     */
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<CreateIpsecServerRequest, Builder> {
        private String clientIpPool; 
        private String clientToken; 
        private String dryRun; 
        private Boolean effectImmediately; 
        private String ikeConfig; 
        private String ipSecServerName; 
        private String ipsecConfig; 
        private String localSubnet; 
        private String psk; 
        private Boolean pskEnabled; 
        private String regionId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpsecServerRequest request) {
            super(request);
            this.clientIpPool = request.clientIpPool;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.effectImmediately = request.effectImmediately;
            this.ikeConfig = request.ikeConfig;
            this.ipSecServerName = request.ipSecServerName;
            this.ipsecConfig = request.ipsecConfig;
            this.localSubnet = request.localSubnet;
            this.psk = request.psk;
            this.pskEnabled = request.pskEnabled;
            this.regionId = request.regionId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * The client CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client.
         * <p>
         * 
         * >  The client CIDR block must not overlap with the CIDR blocks of the VPC.
         */
        public Builder clientIpPool(String clientIpPool) {
            this.putQueryParameter("ClientIpPool", clientIpPool);
            this.clientIpPool = clientIpPool;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to only precheck this request. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request without creating the IPsec server. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. This is the default value. If the request passes the precheck, the system creates the IPsec server.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Specify whether to start connection negotiations immediately. Valid values:
         * <p>
         * 
         * *   **true**: immediately initiates negotiations after the configuration is complete.
         * *   **false** (default): initiates negotiations when inbound traffic is detected. This is the default value.
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * The configuration of Phase 1 negotiation. Valid values:
         * <p>
         * 
         * *   **IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev2**.
         * *   **IkeMode**: the IKE negotiation mode. Default value: **main**.
         * *   **IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiation. Default value: **aes**.
         * *   **IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiation. Default value: **sha1**.
         * *   **IkePfs**: the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiation. Default value: **group2**.
         * *   **IkeLifetime**: the security association (SA) lifetime determined by Phase 1 negotiation. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.
         * *   **LocalId**: the identifier of the IPsec server. The value can be a fully qualified domain name (FQDN) or an IP address. The default value is the public IP address of the VPN gateway.
         * *   **RemoteId**: the peer identifier. The value can be an FQDN or an IP address. The default value is empty.
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * The IPsec server name.
         * <p>
         * 
         * The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder ipSecServerName(String ipSecServerName) {
            this.putQueryParameter("IpSecServerName", ipSecServerName);
            this.ipSecServerName = ipSecServerName;
            return this;
        }

        /**
         * The configuration of Phase 2 negotiation. Valid values:
         * <p>
         * 
         * *   **IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiation. Default value: **aes**.
         * *   **IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiation. Default value: **sha1**.
         * *   **IpsecPfs**: forwards packets of all protocols. The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiation. Default value: **group2**.
         * *   **IpsecLifetime**: the SA lifetime determined by Phase 2 negotiation. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * The local CIDR blocks, which are the CIDR blocks of the virtual private cloud (VPC) for the client to access.
         * <p>
         * 
         * Multiple CIDR blocks are separated with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * The pre-shared key.
         * <p>
         * 
         * The pre-shared key is used for identity authentication between the IPsec server and the client. The key must be 1 to 100 characters in length.
         * 
         * If you do not specify a pre-shared key, the system randomly generates a 16-character string as the pre-shared key. You can call the [ListIpsecServers](~~205453~~) operation to query the pre-shared keys that are generated by the system.
         * 
         * >  The pre-shared key of the IPsec server must be the same as the client key. Otherwise, the IPsec server cannot be connected to the client.
         */
        public Builder psk(String psk) {
            this.putQueryParameter("Psk", psk);
            this.psk = psk;
            return this;
        }

        /**
         * Specifies whether to enable pre-shared key authentication. If you set the value to **true**, pre-shared key authentication is enabled.
         */
        public Builder pskEnabled(Boolean pskEnabled) {
            this.putQueryParameter("PskEnabled", pskEnabled);
            this.pskEnabled = pskEnabled;
            return this;
        }

        /**
         * The ID of the region where the VPN gateway is deployed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public CreateIpsecServerRequest build() {
            return new CreateIpsecServerRequest(this);
        } 

    } 

}
