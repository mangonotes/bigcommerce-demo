function fetchData(url,templateId, divId)
{
console.log(url)
fetch(url)
  .then(response => response.json())
  .then(json => {
  console.log(json)
  this.callback(json, url, templateId, divId);
  });
}

var context = {
callback : function(json, url, templateId, divId)
{

var theTemplateScript = Handlebars.templates[templateId];
console.log(theTemplateScript);
var theCompiledHtml = theTemplateScript(json);
document.getElementById(divId).innerHTML+= theCompiledHtml;
}
}