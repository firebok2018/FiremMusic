<link rel="stylesheet" href="CSS/style_search.css">
<script src="JS/jquery.min.js"></script>
<div id="boxsearch">
	<div id="as">
		<img id="iconSearch" src="Imagen/search.png" alt="Search">
		<input type="text" id="searchx" placeholder="Song, Artist ,Album">
		<span id="not">&times</span>
	</div>
</div>
<div id="list">
	<div id="xt">
		<x class="x id" id="">ID</x>
		<x class="x name" id="id">Name</x>
		<x class="x namea" id="">Artist Name</x>
		<x class="x play" id=""> </x>
	</div>
	<div class="xcon">
		<y class="x id fs" id="">1</y>
		<y class="x name fs" id="">{name_Song}</y>
		<y class="x namea fs" id="">{name_artist}</y>
		<y class="x play fs" id="">{boton play}</y>
	</div>

</div>
<script>
	$(document).ready(function(){
		$('#boxsearch').css({
			
		})
		$('#searchx').focus(function(){
			//alert('funciona')
			$('#sx').css({
				backgroundColor:'rgba(0,0,0,.2)'
			})
			$('#boxsearch').css({paddingTop:'10%',transition: 'all .3s'})
			$('#not').css({visibility: 'visible'})
			
		})
		$('#not').click(function(){
			$('#searchx').val('')
			$('#sx').css({
				backgroundColor:'transparent'
			})
			$('#boxsearch').css({paddingTop:'20%',transition: 'all .3s'})
			$('#not').css({visibility: 'hidden'})
		})
		
		
		
	})
</script>