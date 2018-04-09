# Calendar
A calendar app being developed purely in java, meant for studies to create an easy overview of upcoming events. <br>
<br>
<b>Object structure:</b><br>
<i>Event (public):</i>
<ul>
  <li>Title(string, required)</li>
  <li>Subtitle(string, optional)</li>
  <li>Note(string, optional)</li>
  <li>Date and time(DateFormat, date: required, time: optional)</li>
  <li>Category(string, required)</li>
  <li><i>Include JPanel showing corrosponding information</i></li>
  <li><i>Use create event method and store in internal array</i></li>
</ul>
<i>Category (public):</i>
<ul>
  <li>Title(string)</li>
  <li>Color(Color)</li>
  <li>Description(string) // Constant thoughout same category</li>
</ul>
<i>Resource manager (public static):</i>
<ul>
  <li><i>Fetch images (smart, so it will only fetch if not already)</i></li>
  <li><i>Fetch textfiles</i></li>
  <li><i>Write textfiles</i></li>
</ul>

