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
fun DataCollectionScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Data Collection Policy") }
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
                    text = "Trustify360 Data Collection Policy",
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
                SectionHeader("1. Overview")
                SectionText("This Data Collection Policy explains in detail what data Trustify360 collects, how we collect it, why we collect it, and how we use it to provide and improve our CRM services. This policy is designed to give you complete transparency about our data practices.")
                SectionText("We are committed to collecting only the data necessary to provide you with excellent service while respecting your privacy and giving you control over your information.")

                SectionHeader("2. Types of Data We Collect")
                SectionSubHeader("2.1 Personal Identification Data")
                SectionText("We collect personal information that directly identifies you or can be used to identify you:")
                BulletPointText("• Full name (first, middle, last)")
                BulletPointText("• Email address (primary and secondary)")
                BulletPointText("• Phone numbers (mobile, office, home)")
                BulletPointText("• Physical address (billing and shipping)")
                BulletPointText("• Date of birth (for age verification)")
                BulletPointText("• Government-issued ID numbers (when required for compliance)")
                BulletPointText("• Profile photograph or avatar")
                BulletPointText("• Signature (for digital document signing)")

                SectionSubHeader("2.2 Professional Information")
                SectionText("Information related to your business and professional activities:")
                BulletPointText("• Company name and business registration details")
                BulletPointText("• Job title and department")
                BulletPointText("• Work email and phone numbers")
                BulletPointText("• Industry and business sector")
                BulletPointText("• Company size and annual revenue (for service customization)")
                BulletPointText("• Professional certifications and qualifications")
                BulletPointText("• LinkedIn profile and other professional social media")

                SectionSubHeader("2.3 Customer Relationship Data")
                SectionText("Data you store in our CRM system about your customers and prospects:")
                BulletPointText("• Customer contact information and details")
                BulletPointText("• Interaction history and communication logs")
                BulletPointText("• Sales opportunities and pipeline data")
                BulletPointText("• Purchase history and transaction records")
                BulletPointText("• Customer preferences and behavior patterns")
                BulletPointText("• Support tickets and service requests")
                BulletPointText("• Custom fields and notes you create")
                BulletPointText("• Tags, categories, and segmentation data")

                SectionSubHeader("2.4 Financial and Billing Data")
                SectionText("Information needed to process payments and manage subscriptions:")
                BulletPointText("• Credit card information (stored securely with payment processors)")
                BulletPointText("• Bank account details (for direct debit payments)")
                BulletPointText("• Billing address and tax information")
                BulletPointText("• Payment history and transaction records")
                BulletPointText("• Subscription plan details and usage limits")
                BulletPointText("• Invoices and receipts")
                BulletPointText("• Tax identification numbers (for business accounts)")

                SectionSubHeader("2.5 Technical and Usage Data")
                SectionText("Information about how you use our service and your technical environment:")
                BulletPointText("• IP address and geographic location")
                BulletPointText("• Device information (type, model, operating system)")
                BulletPointText("• Browser type and version")
                BulletPointText("• Login timestamps and session duration")
                BulletPointText("• Pages visited and features used")
                BulletPointText("• Click patterns and user interface interactions")
                BulletPointText("• Search queries within the application")
                BulletPointText("• Performance metrics and error logs")

                SectionSubHeader("2.6 Communication Data")
                SectionText("Records of your communications with us and through our platform:")
                BulletPointText("• Email conversations with support team")
                BulletPointText("• Chat messages and support tickets")
                BulletPointText("• Phone call records and transcripts")
                BulletPointText("• Feedback and survey responses")
                BulletPointText("• Emails sent through our platform")
                BulletPointText("• SMS messages and notifications")
                BulletPointText("• Video call recordings (with consent)")

                SectionHeader("3. Data Collection Methods")
                SectionSubHeader("3.1 Direct Collection")
                SectionText("Information you provide directly to us through:")
                BulletPointText("• Account registration and profile setup")
                BulletPointText("• Form submissions and surveys")
                BulletPointText("• Customer support interactions")
                BulletPointText("• File uploads and data imports")
                BulletPointText("• Manual data entry within the application")
                BulletPointText("• Phone calls and video conferences")
                BulletPointText("• Training sessions and webinars")

                SectionSubHeader("3.2 Automatic Collection")
                SectionText("Data collected automatically when you use our services:")
                BulletPointText("• Server logs and access records")
                BulletPointText("• Cookies and tracking pixels")
                BulletPointText("• Analytics and performance monitoring")
                BulletPointText("• Error reporting and crash logs")
                BulletPointText("• Security monitoring and fraud detection")
                BulletPointText("• A/B testing and feature usage analytics")

                SectionSubHeader("3.3 Third-Party Sources")
                SectionText("Information obtained from external sources:")
                BulletPointText("• Social media platforms (with your permission)")
                BulletPointText("• Business directories and public databases")
                BulletPointText("• Data enrichment services")
                BulletPointText("• Integration partners and APIs")
                BulletPointText("• Referral partners and affiliates")
                BulletPointText("• Public records and government databases")

                SectionHeader("4. Purposes of Data Collection")
                SectionSubHeader("4.1 Service Delivery")
                SectionText("We collect data to provide and maintain our core CRM services:")
                BulletPointText("• Account creation and user authentication")
                BulletPointText("• Data storage and synchronization")
                BulletPointText("• Feature access and functionality")
                BulletPointText("• Performance optimization and reliability")
                BulletPointText("• Technical support and troubleshooting")
                BulletPointText("• Service customization and personalization")

                SectionSubHeader("4.2 Business Operations")
                SectionText("Data usage for essential business functions:")
                BulletPointText("• Billing and subscription management")
                BulletPointText("• Payment processing and financial reporting")
                BulletPointText("• Customer relationship management")
                BulletPointText("• Contract management and compliance")
                BulletPointText("• Risk assessment and fraud prevention")
                BulletPointText("• Legal compliance and regulatory requirements")

                SectionSubHeader("4.3 Product Improvement")
                SectionText("Using data to enhance our services:")
                BulletPointText("• Feature development and enhancement")
                BulletPointText("• User experience optimization")
                BulletPointText("• Performance monitoring and optimization")
                BulletPointText("• Bug fixes and security improvements")
                BulletPointText("• A/B testing and experimentation")
                BulletPointText("• Machine learning and AI model training")

                SectionSubHeader("4.4 Communication and Marketing")
                SectionText("Communicating with you about our services:")
                BulletPointText("• Service notifications and updates")
                BulletPointText("• Security alerts and important announcements")
                BulletPointText("• Customer support and assistance")
                BulletPointText("• Educational content and best practices")
                BulletPointText("• Product updates and new features")
                BulletPointText("• Marketing communications (with consent)")

                SectionHeader("5. Data Collection Technologies")
                SectionSubHeader("5.1 Cookies and Local Storage")
                SectionText("We use various technologies to collect and store information:")
                BulletPointText("• Essential cookies for basic functionality")
                BulletPointText("• Performance cookies for analytics")
                BulletPointText("• Functionality cookies for user preferences")
                BulletPointText("• Local storage for offline capabilities")
                BulletPointText("• Session storage for temporary data")

                SectionSubHeader("5.2 Analytics and Tracking")
                SectionText("Tools and technologies used to understand usage patterns:")
                BulletPointText("• Google Analytics (anonymized data)")
                BulletPointText("• Custom analytics platform")
                BulletPointText("• Heat mapping and user session recording")
                BulletPointText("• API usage monitoring and logging")
                BulletPointText("• Performance monitoring tools")
                BulletPointText("• Error tracking and reporting systems")

                SectionSubHeader("5.3 Security Monitoring")
                SectionText("Technologies used to protect our platform and users:")
                BulletPointText("• Intrusion detection systems")
                BulletPointText("• Fraud detection algorithms")
                BulletPointText("• Security audit logging")
                BulletPointText("• Threat intelligence feeds")
                BulletPointText("• Vulnerability scanning tools")

                SectionHeader("6. Data Minimization Principles")
                SectionText("We follow data minimization principles to collect only what we need:")
                BulletPointText("• Purpose limitation: Data collected for specific, legitimate purposes")
                BulletPointText("• Necessity: Only data necessary for stated purposes")
                BulletPointText("• Proportionality: Collection proportional to the service provided")
                BulletPointText("• Accuracy: Efforts to maintain accurate and up-to-date information")
                BulletPointText("• Storage limitation: Data kept only as long as necessary")
                BulletPointText("• Regular review: Periodic assessment of data collection practices")

                SectionHeader("7. Special Categories of Data")
                SectionSubHeader("7.1 Sensitive Personal Data")
                SectionText("We generally do not collect sensitive personal information unless specifically required for compliance or with explicit consent. This includes:")
                BulletPointText("• Health information")
                BulletPointText("• Religious or philosophical beliefs")
                BulletPointText("• Political opinions")
                BulletPointText("• Racial or ethnic origin")
                BulletPointText("• Sexual orientation")
                BulletPointText("• Biometric data")

                SectionSubHeader("7.2 Children's Data")
                SectionText("Our service is not intended for children under 16. We do not knowingly collect personal information from children under 16 years of age.")

                SectionHeader("8. Data Quality and Accuracy")
                SectionText("We implement measures to ensure data quality:")
                BulletPointText("• Regular data validation and cleansing")
                BulletPointText("• User verification processes")
                BulletPointText("• Automated duplicate detection and removal")
                BulletPointText("• Data enrichment and standardization")
                BulletPointText("• User-initiated corrections and updates")
                BulletPointText("• Periodic data quality audits")

                SectionHeader("9. Data Retention Periods")
                SectionSubHeader("9.1 Account Data")
                SectionText("Personal account information retention:")
                BulletPointText("• Active accounts: Retained while account is active")
                BulletPointText("• Closed accounts: 90 days after account closure")
                BulletPointText("• Backup data: Up to 1 year in secure backups")

                SectionSubHeader("9.2 Customer Data")
                SectionText("Data you store about your customers:")
                BulletPointText("• Retained as long as you maintain it in your account")
                BulletPointText("• Available for export before account closure")
                BulletPointText("• Permanently deleted within 30 days of account termination")

                SectionSubHeader("9.3 Technical Data")
                SectionText("System and usage data retention:")
                BulletPointText("• Server logs: 90 days")
                BulletPointText("• Analytics data: 2 years (anonymized after 6 months)")
                BulletPointText("• Security logs: 7 years for audit purposes")
                BulletPointText("• Support tickets: 3 years")

                SectionSubHeader("9.4 Financial Data")
                SectionText("Billing and payment information retention:")
                BulletPointText("• Payment records: 7 years for tax compliance")
                BulletPointText("• Credit card data: Not stored (handled by payment processors)")
                BulletPointText("• Invoices and receipts: 7 years")

                SectionHeader("10. Your Rights and Control")
                SectionSubHeader("10.1 Access Rights")
                SectionText("You have the right to:")
                BulletPointText("• Request a copy of all data we hold about you")
                BulletPointText("• Understand how your data is being used")
                BulletPointText("• Know who has access to your data")
                BulletPointText("• Receive data in a machine-readable format")

                SectionSubHeader("10.2 Correction and Update")
                SectionText("You can:")
                BulletPointText("• Update your profile information at any time")
                BulletPointText("• Correct inaccurate data through your account")
                BulletPointText("• Request assistance with bulk data corrections")
                BulletPointText("• Set up automatic data synchronization")

                SectionSubHeader("10.3 Deletion and Opt-Out")
                SectionText("Your deletion and opt-out rights:")
                BulletPointText("• Delete specific data records")
                BulletPointText("• Request complete account deletion")
                BulletPointText("• Opt-out of marketing communications")
                BulletPointText("• Disable certain data collection features")
                BulletPointText("• Export data before deletion")

                SectionHeader("11. International Data Transfers")
                SectionText("Your data may be processed in different countries:")
                BulletPointText("• Primary servers located in [Region]")
                BulletPointText("• Backup servers in multiple geographic locations")
                BulletPointText("• Third-party services may process data globally")
                BulletPointText("• All transfers protected by appropriate safeguards")
                BulletPointText("• Standard Contractual Clauses used for EU transfers")

                SectionHeader("12. Data Breach Response")
                SectionText("In the event of a data breach, we will:")
                BulletPointText("• Contain the breach immediately")
                BulletPointText("• Assess the impact and affected data")
                BulletPointText("• Notify relevant authorities within 72 hours")
                BulletPointText("• Inform affected users without undue delay")
                BulletPointText("• Provide clear information about the incident")
                BulletPointText("• Take steps to prevent future breaches")

                SectionHeader("13. Third-Party Data Processors")
                SectionText("We work with carefully selected third parties who may process your data:")
                BulletPointText("• Cloud infrastructure providers (AWS, Google Cloud)")
                BulletPointText("• Payment processors (Stripe, PayPal)")
                BulletPointText("• Email service providers (SendGrid, Mailchimp)")
                BulletPointText("• Analytics services (Google Analytics)")
                BulletPointText("• Support tools (Zendesk, Intercom)")
                BulletPointText("• All third parties bound by strict data processing agreements")

                SectionHeader("14. Compliance and Certifications")
                SectionText("Our data collection practices comply with:")
                BulletPointText("• General Data Protection Regulation (GDPR)")
                BulletPointText("• California Consumer Privacy Act (CCPA)")
                BulletPointText("• SOC 2 Type II compliance")
                BulletPointText("• ISO 27001 security standards")
                BulletPointText("• HIPAA (for healthcare customers)")
                BulletPointText("• Industry-specific regulations as applicable")

                SectionHeader("15. Updates to Data Collection Practices")
                SectionText("We may update our data collection practices to:")
                BulletPointText("• Comply with new legal requirements")
                BulletPointText("• Improve service functionality")
                BulletPointText("• Enhance security measures")
                BulletPointText("• Respond to user feedback")
                SectionText("Material changes will be communicated 30 days in advance through email and in-app notifications.")

                SectionHeader("16. Contact Information")
                SectionText("For questions about our data collection practices, contact:")

                SectionSubHeader("Data Protection Team")
                BulletPointText("• Email: dataprotection@trustify360.com")
                BulletPointText("• Phone: +1 (555) 123-4567")

                SectionSubHeader("Data Protection Officer")
                BulletPointText("• Email: dpo@trustify360.com")
                BulletPointText("• Direct line: +1 (555) 123-4568")

                SectionSubHeader("Privacy Requests")
                BulletPointText("• Email: privacy@trustify360.com")
                BulletPointText("• Online portal: privacy.trustify360.com")

                SectionSubHeader("Mailing Address")
                BulletPointText("• Trustify360 Data Protection Team")
                BulletPointText("• 123 Business Avenue, Suite 100")
                BulletPointText("• Business City, BC 12345")
                BulletPointText("• United States")

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "We are committed to transparent data collection practices that respect your privacy while enabling us to provide excellent CRM services. Your trust is fundamental to our relationship.",
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