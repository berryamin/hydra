/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SwaggerJSONWebKey swagger JSON web key
 */
@ApiModel(description = "SwaggerJSONWebKey swagger JSON web key")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-20T11:10:34.919+02:00")
public class SwaggerJSONWebKey {
  @JsonProperty("alg")
  private String alg = null;

  @JsonProperty("crv")
  private String crv = null;

  @JsonProperty("d")
  private String d = null;

  @JsonProperty("dp")
  private String dp = null;

  @JsonProperty("dq")
  private String dq = null;

  @JsonProperty("e")
  private String e = null;

  @JsonProperty("k")
  private String k = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("n")
  private String n = null;

  @JsonProperty("p")
  private String p = null;

  @JsonProperty("q")
  private String q = null;

  @JsonProperty("qi")
  private String qi = null;

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("x5c")
  private List<String> x5c = null;

  @JsonProperty("y")
  private String y = null;

  public SwaggerJSONWebKey alg(String alg) {
    this.alg = alg;
    return this;
  }

   /**
   * The \&quot;alg\&quot; (algorithm) parameter identifies the algorithm intended for use with the key.  The values used should either be registered in the IANA \&quot;JSON Web Signature and Encryption Algorithms\&quot; registry established by [JWA] or be a value that contains a Collision- Resistant Name.
   * @return alg
  **/
  @ApiModelProperty(required = true, value = "The \"alg\" (algorithm) parameter identifies the algorithm intended for use with the key.  The values used should either be registered in the IANA \"JSON Web Signature and Encryption Algorithms\" registry established by [JWA] or be a value that contains a Collision- Resistant Name.")
  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public SwaggerJSONWebKey crv(String crv) {
    this.crv = crv;
    return this;
  }

   /**
   * crv
   * @return crv
  **/
  @ApiModelProperty(value = "crv")
  public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }

  public SwaggerJSONWebKey d(String d) {
    this.d = d;
    return this;
  }

   /**
   * d
   * @return d
  **/
  @ApiModelProperty(value = "d")
  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  public SwaggerJSONWebKey dp(String dp) {
    this.dp = dp;
    return this;
  }

   /**
   * dp
   * @return dp
  **/
  @ApiModelProperty(value = "dp")
  public String getDp() {
    return dp;
  }

  public void setDp(String dp) {
    this.dp = dp;
  }

  public SwaggerJSONWebKey dq(String dq) {
    this.dq = dq;
    return this;
  }

   /**
   * dq
   * @return dq
  **/
  @ApiModelProperty(value = "dq")
  public String getDq() {
    return dq;
  }

  public void setDq(String dq) {
    this.dq = dq;
  }

  public SwaggerJSONWebKey e(String e) {
    this.e = e;
    return this;
  }

   /**
   * e
   * @return e
  **/
  @ApiModelProperty(value = "e")
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  public SwaggerJSONWebKey k(String k) {
    this.k = k;
    return this;
  }

   /**
   * k
   * @return k
  **/
  @ApiModelProperty(value = "k")
  public String getK() {
    return k;
  }

  public void setK(String k) {
    this.k = k;
  }

  public SwaggerJSONWebKey kid(String kid) {
    this.kid = kid;
    return this;
  }

   /**
   * The \&quot;kid\&quot; (key ID) parameter is used to match a specific key.  This is used, for instance, to choose among a set of keys within a JWK Set during key rollover.  The structure of the \&quot;kid\&quot; value is unspecified.  When \&quot;kid\&quot; values are used within a JWK Set, different keys within the JWK Set SHOULD use distinct \&quot;kid\&quot; values.  (One example in which different keys might use the same \&quot;kid\&quot; value is if they have different \&quot;kty\&quot; (key type) values but are considered to be equivalent alternatives by the application using them.)  The \&quot;kid\&quot; value is a case-sensitive string.
   * @return kid
  **/
  @ApiModelProperty(required = true, value = "The \"kid\" (key ID) parameter is used to match a specific key.  This is used, for instance, to choose among a set of keys within a JWK Set during key rollover.  The structure of the \"kid\" value is unspecified.  When \"kid\" values are used within a JWK Set, different keys within the JWK Set SHOULD use distinct \"kid\" values.  (One example in which different keys might use the same \"kid\" value is if they have different \"kty\" (key type) values but are considered to be equivalent alternatives by the application using them.)  The \"kid\" value is a case-sensitive string.")
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public SwaggerJSONWebKey kty(String kty) {
    this.kty = kty;
    return this;
  }

   /**
   * The \&quot;kty\&quot; (key type) parameter identifies the cryptographic algorithm family used with the key, such as \&quot;RSA\&quot; or \&quot;EC\&quot;. \&quot;kty\&quot; values should either be registered in the IANA \&quot;JSON Web Key Types\&quot; registry established by [JWA] or be a value that contains a Collision- Resistant Name.  The \&quot;kty\&quot; value is a case-sensitive string.
   * @return kty
  **/
  @ApiModelProperty(required = true, value = "The \"kty\" (key type) parameter identifies the cryptographic algorithm family used with the key, such as \"RSA\" or \"EC\". \"kty\" values should either be registered in the IANA \"JSON Web Key Types\" registry established by [JWA] or be a value that contains a Collision- Resistant Name.  The \"kty\" value is a case-sensitive string.")
  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public SwaggerJSONWebKey n(String n) {
    this.n = n;
    return this;
  }

   /**
   * n
   * @return n
  **/
  @ApiModelProperty(value = "n")
  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public SwaggerJSONWebKey p(String p) {
    this.p = p;
    return this;
  }

   /**
   * p
   * @return p
  **/
  @ApiModelProperty(value = "p")
  public String getP() {
    return p;
  }

  public void setP(String p) {
    this.p = p;
  }

  public SwaggerJSONWebKey q(String q) {
    this.q = q;
    return this;
  }

   /**
   * q
   * @return q
  **/
  @ApiModelProperty(value = "q")
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public SwaggerJSONWebKey qi(String qi) {
    this.qi = qi;
    return this;
  }

   /**
   * qi
   * @return qi
  **/
  @ApiModelProperty(value = "qi")
  public String getQi() {
    return qi;
  }

  public void setQi(String qi) {
    this.qi = qi;
  }

  public SwaggerJSONWebKey use(String use) {
    this.use = use;
    return this;
  }

   /**
   * Use (\&quot;public key use\&quot;) identifies the intended use of the public key. The \&quot;use\&quot; parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Values are commonly \&quot;sig\&quot; (signature) or \&quot;enc\&quot; (encryption).
   * @return use
  **/
  @ApiModelProperty(required = true, value = "Use (\"public key use\") identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Values are commonly \"sig\" (signature) or \"enc\" (encryption).")
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public SwaggerJSONWebKey x(String x) {
    this.x = x;
    return this;
  }

   /**
   * x
   * @return x
  **/
  @ApiModelProperty(value = "x")
  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public SwaggerJSONWebKey x5c(List<String> x5c) {
    this.x5c = x5c;
    return this;
  }

  public SwaggerJSONWebKey addX5cItem(String x5cItem) {
    if (this.x5c == null) {
      this.x5c = new ArrayList<String>();
    }
    this.x5c.add(x5cItem);
    return this;
  }

   /**
   * The \&quot;x5c\&quot; (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates [RFC5280].  The certificate chain is represented as a JSON array of certificate value strings.  Each string in the array is a base64-encoded (Section 4 of [RFC4648] -- not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value. The PKIX certificate containing the key value MUST be the first certificate.
   * @return x5c
  **/
  @ApiModelProperty(value = "The \"x5c\" (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates [RFC5280].  The certificate chain is represented as a JSON array of certificate value strings.  Each string in the array is a base64-encoded (Section 4 of [RFC4648] -- not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value. The PKIX certificate containing the key value MUST be the first certificate.")
  public List<String> getX5c() {
    return x5c;
  }

  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }

  public SwaggerJSONWebKey y(String y) {
    this.y = y;
    return this;
  }

   /**
   * y
   * @return y
  **/
  @ApiModelProperty(value = "y")
  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerJSONWebKey swaggerJSONWebKey = (SwaggerJSONWebKey) o;
    return Objects.equals(this.alg, swaggerJSONWebKey.alg) &&
        Objects.equals(this.crv, swaggerJSONWebKey.crv) &&
        Objects.equals(this.d, swaggerJSONWebKey.d) &&
        Objects.equals(this.dp, swaggerJSONWebKey.dp) &&
        Objects.equals(this.dq, swaggerJSONWebKey.dq) &&
        Objects.equals(this.e, swaggerJSONWebKey.e) &&
        Objects.equals(this.k, swaggerJSONWebKey.k) &&
        Objects.equals(this.kid, swaggerJSONWebKey.kid) &&
        Objects.equals(this.kty, swaggerJSONWebKey.kty) &&
        Objects.equals(this.n, swaggerJSONWebKey.n) &&
        Objects.equals(this.p, swaggerJSONWebKey.p) &&
        Objects.equals(this.q, swaggerJSONWebKey.q) &&
        Objects.equals(this.qi, swaggerJSONWebKey.qi) &&
        Objects.equals(this.use, swaggerJSONWebKey.use) &&
        Objects.equals(this.x, swaggerJSONWebKey.x) &&
        Objects.equals(this.x5c, swaggerJSONWebKey.x5c) &&
        Objects.equals(this.y, swaggerJSONWebKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, crv, d, dp, dq, e, k, kid, kty, n, p, q, qi, use, x, x5c, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerJSONWebKey {\n");
    
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
