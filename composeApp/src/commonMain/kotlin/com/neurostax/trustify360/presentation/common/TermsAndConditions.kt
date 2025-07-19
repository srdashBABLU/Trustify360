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
fun TermsAndConditionsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Terms & Conditions") }
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
                    text = "Trustify360 CRM Terms and Conditions",
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
                SectionHeader("1. Agreement to Terms")
                SectionText("By accessing and using Trustify360 CRM services (\"Service\"), you agree to be bound by these Terms and Conditions (\"Terms\"). These Terms apply to all users of the Service, including visitors, customers, and other users who access or use the Service.")
                SectionText("If you disagree with any part of these Terms, then you may not access the Service. Your access to and use of the Service is conditioned on your acceptance of and compliance with these Terms.")

                SectionHeader("2. Description of Service")
                SectionText("Trustify360 is a cloud-based Customer Relationship Management (CRM) platform that provides:")
                BulletPointText("• Contact and customer data management")
                BulletPointText("• Sales pipeline and opportunity tracking")
                BulletPointText("• Communication history and interaction logging")
                BulletPointText("• Reporting and analytics tools")
                BulletPointText("• Integration capabilities with third-party services")
                BulletPointText("• Mobile and web application access")
                SectionText("We reserve the right to modify, suspend, or discontinue any part of the Service at any time with reasonable notice.")

                SectionHeader("3. User Accounts and Registration")
                SectionSubHeader("3.1 Account Creation")
                SectionText("To access certain features of the Service, you must register for an account. When creating an account, you must provide accurate, current, and complete information. You are responsible for maintaining the confidentiality of your account credentials.")

                SectionSubHeader("3.2 Account Responsibility")
                SectionText("You are responsible for all activities that occur under your account. You agree to:")
                BulletPointText("• Maintain the security of your login credentials")
                BulletPointText("• Notify us immediately of any unauthorized use")
                BulletPointText("• Ensure all information provided is accurate and up-to-date")
                BulletPointText("• Comply with all applicable laws and regulations")

                SectionSubHeader("3.3 Account Termination")
                SectionText("We may terminate or suspend your account immediately, without prior notice, if you breach these Terms or engage in prohibited activities.")

                SectionHeader("4. Acceptable Use Policy")
                SectionText("You agree not to use the Service for any unlawful purpose or in any way that could damage, disable, or impair the Service. Prohibited activities include:")

                SectionSubHeader("4.1 Prohibited Content")
                BulletPointText("• Uploading malicious software, viruses, or harmful code")
                BulletPointText("• Storing illegal, defamatory, or infringing content")
                BulletPointText("• Sharing content that violates privacy rights")
                BulletPointText("• Distributing spam or unsolicited communications")

                SectionSubHeader("4.2 Prohibited Activities")
                BulletPointText("• Attempting to gain unauthorized access to systems")
                BulletPointText("• Interfering with the Service's security features")
                BulletPointText("• Reverse engineering or decompiling the software")
                BulletPointText("• Using automated tools to access the Service without permission")
                BulletPointText("• Violating any applicable local, state, or international law")

                SectionHeader("5. Subscription Plans and Billing")
                SectionSubHeader("5.1 Subscription Fees")
                SectionText("Access to certain features requires a paid subscription. Subscription fees are charged in advance on a monthly or annual basis according to your selected plan. All fees are non-refundable except as required by law or as specifically stated in these Terms.")

                SectionSubHeader("5.2 Billing and Payment")
                SectionText("By providing payment information, you authorize us to charge the applicable fees to your payment method. You are responsible for:")
                BulletPointText("• Maintaining valid payment information")
                BulletPointText("• Paying all fees and charges on time")
                BulletPointText("• Any taxes applicable to your use of the Service")
                BulletPointText("• Notifying us of changes to your billing information")

                SectionSubHeader("5.3 Price Changes")
                SectionText("We reserve the right to change our pricing at any time. Price changes will be communicated at least 30 days in advance for existing subscribers and will take effect at your next billing cycle.")

                SectionSubHeader("5.4 Cancellation and Refunds")
                SectionText("You may cancel your subscription at any time through your account settings. Cancellations take effect at the end of the current billing period. We offer a 30-day money-back guarantee for new subscribers.")

                SectionHeader("6. Data Ownership and Usage Rights")
                SectionSubHeader("6.1 Your Data")
                SectionText("You retain all rights, title, and interest in the data you store in the Service (\"Customer Data\"). We do not claim ownership of your Customer Data and will not access it except:")
                BulletPointText("• To provide the Service as requested")
                BulletPointText("• To troubleshoot technical issues with your consent")
                BulletPointText("• To comply with legal obligations")
                BulletPointText("• To prevent fraud or security breaches")

                SectionSubHeader("6.2 License to Use")
                SectionText("You grant us a limited, non-exclusive license to use, process, and store your Customer Data solely to provide the Service. This license terminates when you delete data or terminate your account.")

                SectionSubHeader("6.3 Data Backup and Recovery")
                SectionText("While we maintain regular backups, you are responsible for maintaining your own backup copies of important data. We provide data export tools to facilitate this process.")

                SectionHeader("7. Intellectual Property Rights")
                SectionSubHeader("7.1 Our Intellectual Property")
                SectionText("The Service and its original content, features, and functionality are and will remain the exclusive property of Trustify360 and its licensors. The Service is protected by copyright, trademark, and other intellectual property laws.")

                SectionSubHeader("7.2 Your License to Use")
                SectionText("Subject to these Terms, we grant you a limited, non-exclusive, non-transferable license to use the Service for your internal business purposes during your subscription period.")

                SectionSubHeader("7.3 Trademark Usage")
                SectionText("You may not use our trademarks, logos, or brand names without our prior written consent. Any unauthorized use is strictly prohibited.")

                SectionHeader("8. Privacy and Data Protection")
                SectionText("Your privacy is important to us. Our collection, use, and protection of your personal information is governed by our Privacy Policy, which is incorporated by reference into these Terms. By using the Service, you consent to the collection and use of information as outlined in our Privacy Policy.")

                SectionHeader("9. Service Availability and Maintenance")
                SectionSubHeader("9.1 Service Level")
                SectionText("We strive to maintain 99.9% uptime for our Service, but we do not guarantee uninterrupted access. The Service may be temporarily unavailable due to:")
                BulletPointText("• Scheduled maintenance and updates")
                BulletPointText("• Emergency security patches")
                BulletPointText("• Technical difficulties or server issues")
                BulletPointText("• Third-party service provider outages")

                SectionSubHeader("9.2 Maintenance Windows")
                SectionText("Scheduled maintenance will be announced in advance when possible. Emergency maintenance may occur without prior notice if necessary to protect the security or integrity of the Service.")

                SectionHeader("10. Third-Party Integrations")
                SectionText("The Service may integrate with third-party applications and services. Your use of such integrations is subject to the terms and conditions of those third parties. We are not responsible for:")
                BulletPointText("• The availability or functionality of third-party services")
                BulletPointText("• Data handling practices of third-party providers")
                BulletPointText("• Security breaches involving third-party services")
                BulletPointText("• Changes to third-party APIs or terms of service")

                SectionHeader("11. Limitation of Liability")
                SectionText("TO THE MAXIMUM EXTENT PERMITTED BY APPLICABLE LAW, IN NO EVENT SHALL TRUSTIFY360, ITS AFFILIATES, OFFICERS, DIRECTORS, EMPLOYEES, OR AGENTS BE LIABLE FOR ANY INDIRECT, INCIDENTAL, SPECIAL, CONSEQUENTIAL, OR PUNITIVE DAMAGES, INCLUDING WITHOUT LIMITATION:")
                BulletPointText("• Loss of profits, data, or business opportunities")
                BulletPointText("• Business interruption or system downtime")
                BulletPointText("• Cost of substitute services or products")
                BulletPointText("• Unauthorized access to or alteration of data")
                SectionText("Our total liability for all claims related to the Service shall not exceed the amount paid by you for the Service in the 12 months preceding the claim.")

                SectionHeader("12. Indemnification")
                SectionText("You agree to indemnify, defend, and hold harmless Trustify360 and its affiliates, officers, directors, employees, and agents from and against any claims, liabilities, damages, losses, and expenses arising out of or related to:")
                BulletPointText("• Your use of the Service")
                BulletPointText("• Your violation of these Terms")
                BulletPointText("• Your violation of any rights of another party")
                BulletPointText("• Your Customer Data or content")

                SectionHeader("13. Disclaimer of Warranties")
                SectionText("THE SERVICE IS PROVIDED ON AN \"AS IS\" AND \"AS AVAILABLE\" BASIS. TRUSTIFY360 MAKES NO WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO:")
                BulletPointText("• MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE")
                BulletPointText("• NON-INFRINGEMENT OF THIRD-PARTY RIGHTS")
                BulletPointText("• UNINTERRUPTED OR ERROR-FREE SERVICE")
                BulletPointText("• ACCURACY OR RELIABILITY OF INFORMATION")
                SectionText("Some jurisdictions do not allow the exclusion of certain warranties, so some of the above exclusions may not apply to you.")

                SectionHeader("14. Termination")
                SectionSubHeader("14.1 Termination by You")
                SectionText("You may terminate your account at any time by canceling your subscription through your account settings or by contacting our support team.")

                SectionSubHeader("14.2 Termination by Us")
                SectionText("We may terminate or suspend your access immediately, without prior notice, for any reason including:")
                BulletPointText("• Breach of these Terms")
                BulletPointText("• Non-payment of fees")
                BulletPointText("• Prolonged inactivity")
                BulletPointText("• Violations of our Acceptable Use Policy")

                SectionSubHeader("14.3 Effect of Termination")
                SectionText("Upon termination, your right to use the Service ceases immediately. We will provide you with a reasonable opportunity to export your Customer Data, after which we may delete your data in accordance with our data retention policies.")

                SectionHeader("15. Dispute Resolution")
                SectionSubHeader("15.1 Governing Law")
                SectionText("These Terms are governed by and construed in accordance with the laws of [State/Country], without regard to conflict of law principles.")

                SectionSubHeader("15.2 Dispute Resolution Process")
                SectionText("Before filing any legal action, you agree to attempt to resolve disputes through the following process:")
                BulletPointText("• Direct negotiation with our support team")
                BulletPointText("• Mediation through a mutually agreed mediator")
                BulletPointText("• Binding arbitration if mediation fails")

                SectionSubHeader("15.3 Class Action Waiver")
                SectionText("You agree to resolve disputes with us only on an individual basis and not as part of any class action, collective action, or representative proceeding.")

                SectionHeader("16. Export Control and Sanctions")
                SectionText("The Service may be subject to export control laws and regulations. You represent that you are not:")
                BulletPointText("• Located in a country subject to government embargo")
                BulletPointText("• Listed on any government list of prohibited parties")
                BulletPointText("• Subject to any restrictions that would prohibit use of the Service")

                SectionHeader("17. Force Majeure")
                SectionText("We shall not be liable for any failure or delay in performance due to events beyond our reasonable control, including but not limited to acts of God, natural disasters, war, terrorism, pandemics, government actions, or internet service provider failures.")

                SectionHeader("18. Severability")
                SectionText("If any provision of these Terms is held to be invalid or unenforceable, the remaining provisions shall remain in full force and effect. The invalid provision shall be replaced with a valid provision that most closely reflects the intent of the original provision.")

                SectionHeader("19. Assignment")
                SectionText("You may not assign or transfer your rights under these Terms without our prior written consent. We may assign our rights and obligations under these Terms without restriction, including in connection with a merger, acquisition, or sale of assets.")

                SectionHeader("20. Changes to Terms")
                SectionText("We reserve the right to modify or replace these Terms at any time. If we make material changes, we will notify you by:")
                BulletPointText("• Email notification to your registered address")
                BulletPointText("• In-app notification when you next access the Service")
                BulletPointText("• Posting notice on our website")
                SectionText("Changes take effect 30 days after notification. Your continued use of the Service after changes become effective constitutes acceptance of the new Terms.")

                SectionHeader("21. Entire Agreement")
                SectionText("These Terms, together with our Privacy Policy and any other legal notices published by us on the Service, constitute the entire agreement between you and Trustify360 regarding the Service and supersede all prior or contemporaneous communications and proposals.")

                SectionHeader("22. Contact Information")
                SectionText("If you have any questions about these Terms and Conditions, please contact us:")

                SectionSubHeader("Legal Department")
                BulletPointText("• Email: legal@trustify360.com")
                BulletPointText("• Phone: +1 (555) 123-4567")

                SectionSubHeader("General Support")
                BulletPointText("• Email: support@trustify360.com")
                BulletPointText("• Help Center: help.trustify360.com")

                SectionSubHeader("Mailing Address")
                BulletPointText("• Trustify360 Legal Department")
                BulletPointText("• 123 Business Avenue, Suite 100")
                BulletPointText("• Business City, BC 12345")
                BulletPointText("• United States")

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "By using Trustify360, you acknowledge that you have read, understood, and agree to be bound by these Terms and Conditions. Thank you for choosing Trustify360 for your CRM needs.",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(vertical = 16.dp),
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

//@Composable
//fun SectionHeader(title: String) {
//    Text(
//        text = title,
//        style = MaterialTheme.typography.titleLarge,
//        fontWeight = FontWeight.Bold,
//        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
//        color = MaterialTheme.colorScheme.primary
//    )
//}
//
//@Composable
//fun SectionSubHeader(title: String) {
//    Text(
//        text = title,
//        style = MaterialTheme.typography.titleMedium,
//        fontWeight = FontWeight.SemiBold,
//        modifier = Modifier.padding(top = 16.dp, bottom = 6.dp)
//    )
//}
//
//@Composable
//fun SectionText(text: String) {
//    Text(
//        text = text,
//        style = MaterialTheme.typography.bodyMedium,
//        modifier = Modifier.padding(bottom = 12.dp),
//        lineHeight = 22.sp
//    )
//}
//
//@Composable
//fun BulletPointText(text: String) {
//    Text(
//        text = text,
//        style = MaterialTheme.typography.bodyMedium,
//        modifier = Modifier.padding(start = 16.dp, bottom = 4.dp),
//        lineHeight = 20.sp
//    )
//}