# پیام رسان قزمیت

## گام ۱: افزودن یک روش پیام رسانی دیگر

<table dir='rtl'>
<tbody>

<tr>
<td>
<p><strong>ردیف</strong></p>
</td>
<td>
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td>
<p><strong>عنوان تغییر</strong></p>
</td>
<td>
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td>
<p><strong>۱</strong></p>
</td>
<td>
<p>models</p>
</td>
<td>
<p>افزودن کلاس TelegramMessage</p>
</td>
<td>
<p>برای استفاده در سرویس ارسال پیام تلگرام که از کلاس Message ارث‌بری می‌کند.</p>
</td>
</tr>

<tr>
<td>
<p><strong>۲</strong></p>
</td>
<td>
<p>MessageService</p>
</td>
<td>
<p>اضافه شدن متود sendTelegramMessage</p>
</td>
<td>
<p>متود ارسال پیام تلگرام که به دلیل ابسترکت بودن MessageService باید به SmsMessageService و EmailMessageService نیز اضافه میشد.</p>
</td>
</tr>

<tr>
<td>
<p><strong>۳</strong></p>
</td>
<td>
<p>services</p>
</td>
<td>
<p>اضافه شدن سرویس TelegramMessageService</p>
</td>
<td>
<p>سرویسی که برای ارسال پیام تلگرام استفاده می‌شود. این سرویس از اینترفیس MessageService را پیاده‌سازی می‌کند.</p>
</td>
</tr>

<tr>
<td>
<p><strong>۴</strong></p>
</td>
<td>
<p>Main</p>
</td>
<td>
<p>اضافه شدن قابلیت ارسال پیام تلگرام</p>
</td>
<td>
<p>برای این کار کاربر باید ورودی 3 را وارد کند و سپس از او ‌آیدی مبدا و مقصد و پیام پرسیده می‌شود و message ساخته می‌شود. </p>
</td>
</tr>

<tr>
<td>
<p><strong>۵</strong></p>
</td>
<td>
<p>Main</p>
</td>
<td>
<p>ارسال پیام</p>
</td>
<td>
<p>در صورتی که پیام از جنس TelegramMessage باشد، آن را با سرویس TelegramMessageService ارسال می‌کنیم.</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: ۵
