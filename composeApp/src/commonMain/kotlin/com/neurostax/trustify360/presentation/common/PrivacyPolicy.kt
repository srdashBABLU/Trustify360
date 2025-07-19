package com.neurostax.trustify360.presentation.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrivacyPolicyScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Privacy Policy") }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            item {
                Text(
                    text = "Trustify360 CRM Privacy Policy",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Last Updated: January 2025",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            item {
                SectionHeader("1. Introduction")
                SectionText("Trustify360 is committed to protecting your personal information and your right to privacy. This Privacy Policy explains how we collect, use, store, and safeguard your data when you use our Customer Relationship Management (CRM) platform and related services.")
                SectionText("By using Trustify360, you agree to the collection and use of information in accordance with this policy. We will not use or share your information with anyone except as described in this Privacy Policy.")

                SectionHeader("2. Information We Collect")
                SectionSubHeader("2.1 Personal Information")
                SectionText("We collect personal information that you voluntarily provide to us when registering for an account, using our services, or contacting us. This includes:")
                BulletPointText("• Name, email address, and contact information")
                BulletPointText("• Company name, job title, and business details")
                BulletPointText("• Billing and payment information")
                BulletPointText("• Profile pictures and other uploaded content")

                SectionSubHeader("2.2 Customer and Contact Data")
                SectionText("As part of our CRM services, you may store information about your customers and contacts, including:")
                BulletPointText("• Contact details (names, emails, phone numbers, addresses)")
                BulletPointText("• Communication history and interaction logs")
                BulletPointText("• Sales data, transaction history, and business relationships")
                BulletPointText("• Custom fields and notes you create")

                SectionSubHeader("2.3 Usage and Technical Data")
                SectionText("We automatically collect certain information when you access and use our services:")
                BulletPointText("• Device information (IP address, browser type, operating system)")
                BulletPointText("• Usage patterns and feature interactions")
                BulletPointText("• Log data and performance metrics")
                BulletPointText("• Cookies and similar tracking technologies")

                SectionHeader("3. How We Use Your Information")
                SectionText("We use the collected information for various purposes:")

                SectionSubHeader("3.1 Service Provision")
                BulletPointText("• Provide, maintain, and improve our CRM services")
                BulletPointText("• Process transactions and manage billing")
                BulletPointText("• Authenticate users and secure accounts")
                BulletPointText("• Enable data synchronization across devices")

                SectionSubHeader("3.2 Communication")
                BulletPointText("• Send important service updates and notifications")
                BulletPointText("• Respond to customer support inquiries")
                BulletPointText("• Provide technical assistance and troubleshooting")
                BulletPointText("• Send promotional materials (with your consent)")

                SectionSubHeader("3.3 Analytics and Improvement")
                BulletPointText("• Analyze usage patterns to improve our services")
                BulletPointText("• Conduct research and development")
                BulletPointText("• Generate anonymized analytics and reports")
                BulletPointText("• Detect and prevent fraud or security breaches")

                SectionHeader("4. Legal Basis for Processing")
                SectionText("We process your personal data based on the following legal grounds:")
                BulletPointText("• Contract performance: To provide our services as agreed")
                BulletPointText("• Legitimate interests: For business operations and service improvement")
                BulletPointText("• Legal compliance: To meet regulatory requirements")
                BulletPointText("• Consent: Where you have given explicit permission")

                SectionHeader("5. Data Sharing and Third Parties")
                SectionText("We do not sell, trade, or rent your personal information to third parties. We may share your data in the following limited circumstances:")

                SectionSubHeader("5.1 Service Providers")
                SectionText("We work with trusted third-party service providers who assist us in operating our platform:")
                BulletPointText("• Cloud hosting and infrastructure providers")
                BulletPointText("• Payment processors for billing services")
                BulletPointText("• Email service providers for communications")
                BulletPointText("• Analytics services for usage insights")

                SectionSubHeader("5.2 Legal Requirements")
                SectionText("We may disclose your information if required by law or in response to:")
                BulletPointText("• Valid legal processes (subpoenas, court orders)")
                BulletPointText("• Government investigations or regulatory requests")
                BulletPointText("• Protection of our rights, property, or safety")
                BulletPointText("• Prevention of fraud or illegal activities")

                SectionSubHeader("5.3 Business Transfers")
                SectionText("In the event of a merger, acquisition, or sale of assets, your information may be transferred to the new entity, subject to the same privacy protections.")

                SectionHeader("6. Data Security and Protection")
                SectionText("We implement comprehensive security measures to protect your data:")

                SectionSubHeader("6.1 Technical Safeguards")
                BulletPointText("• End-to-end encryption for data transmission")
                BulletPointText("• AES-256 encryption for data at rest")
                BulletPointText("• Multi-factor authentication options")
                BulletPointText("• Regular security audits and vulnerability assessments")

                SectionSubHeader("6.2 Organizational Measures")
                BulletPointText("• Access controls and role-based permissions")
                BulletPointText("• Employee training on data protection")
                BulletPointText("• Incident response procedures")
                BulletPointText("• Regular backup and disaster recovery protocols")

                SectionHeader("7. Data Retention")
                SectionText("We retain your personal data only as long as necessary for the purposes outlined in this policy:")
                BulletPointText("• Account data: Retained while your account is active")
                BulletPointText("• Customer data: Retained as long as you maintain it in your account")
                BulletPointText("• Usage logs: Typically retained for 2 years for security purposes")
                BulletPointText("• Billing records: Retained for 7 years for tax and legal compliance")
                SectionText("You can request deletion of your data at any time, subject to legal retention requirements.")

                SectionHeader("8. International Data Transfers")
                SectionText("Your data may be processed in countries other than your country of residence. We ensure adequate protection through:")
                BulletPointText("• Standard Contractual Clauses (SCCs) with third parties")
                BulletPointText("• Adequacy decisions recognized by regulatory authorities")
                BulletPointText("• Appropriate technical and organizational safeguards")

                SectionHeader("9. Your Privacy Rights")
                SectionText("Depending on your location, you may have the following rights regarding your personal data:")

                SectionSubHeader("9.1 Access and Portability")
                BulletPointText("• Request access to your personal data")
                BulletPointText("• Obtain a copy of your data in a portable format")
                BulletPointText("• Request information about how your data is processed")

                SectionSubHeader("9.2 Correction and Deletion")
                BulletPointText("• Update or correct inaccurate personal information")
                BulletPointText("• Request deletion of your personal data")
                BulletPointText("• Object to or restrict processing of your data")

                SectionSubHeader("9.3 Consent and Marketing")
                BulletPointText("• Withdraw consent at any time where processing is based on consent")
                BulletPointText("• Opt-out of marketing communications")
                BulletPointText("• Manage cookie preferences")

                SectionHeader("10. Cookies and Tracking Technologies")
                SectionText("We use cookies and similar technologies to enhance your experience:")
                BulletPointText("• Essential cookies: Required for basic functionality")
                BulletPointText("• Analytics cookies: Help us understand usage patterns")
                BulletPointText("• Preference cookies: Remember your settings and preferences")
                SectionText("You can manage cookie settings through your browser preferences or our cookie management tool.")

                SectionHeader("11. Children's Privacy")
                SectionText("Trustify360 is not intended for children under 16 years of age. We do not knowingly collect personal information from children under 16. If we become aware of such collection, we will take steps to delete the information promptly.")

                SectionHeader("12. California Privacy Rights (CCPA)")
                SectionText("California residents have additional rights under the California Consumer Privacy Act:")
                BulletPointText("• Right to know what personal information is collected")
                BulletPointText("• Right to delete personal information")
                BulletPointText("• Right to opt-out of the sale of personal information")
                BulletPointText("• Right to non-discrimination for exercising privacy rights")
                SectionText("We do not sell personal information as defined by the CCPA.")

                SectionHeader("13. European Privacy Rights (GDPR)")
                SectionText("If you are located in the European Economic Area, you have additional rights under the General Data Protection Regulation, including the right to lodge a complaint with your local data protection authority.")

                SectionHeader("14. Changes to This Privacy Policy")
                SectionText("We may update this Privacy Policy from time to time to reflect changes in our practices, technology, legal requirements, or other factors. We will notify you of any material changes by:")
                BulletPointText("• Posting the updated policy on our website")
                BulletPointText("• Sending email notifications to registered users")
                BulletPointText("• Providing in-app notifications")
                SectionText("We encourage you to review this Privacy Policy periodically to stay informed about how we protect your information.")

                SectionHeader("15. Contact Information")
                SectionText("If you have any questions, concerns, or requests regarding this Privacy Policy or our data practices, please contact us:")

                SectionSubHeader("General Inquiries")
                BulletPointText("• Email: privacy@trustify360.com")
                BulletPointText("• Support: support@trustify360.com")
                BulletPointText("• Phone: +1 (555) 123-4567")

                SectionSubHeader("Data Protection Officer")
                BulletPointText("• Email: dpo@trustify360.com")

                SectionSubHeader("Mailing Address")
                BulletPointText("• Trustify360 Privacy Team")
                BulletPointText("• 123 Business Avenue, Suite 100")
                BulletPointText("• Business City, BC 12345")
                BulletPointText("• United States")

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "Thank you for trusting Trustify360 with your business data. We are committed to maintaining the highest standards of privacy and security.",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(vertical = 16.dp),
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        color = MaterialTheme.colorScheme.primary
    )
}

@Composable
fun SectionSubHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(top = 16.dp, bottom = 6.dp)
    )
}

@Composable
fun SectionText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(bottom = 12.dp),
        lineHeight = 22.sp
    )
}

@Composable
fun BulletPointText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(start = 16.dp, bottom = 4.dp),
        lineHeight = 20.sp
    )
}