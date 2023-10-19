const SELECTOR_SIDEBAR_WRAPPER = ".sidebar-wrapper";
const Default = {
	scrollbarTheme: "os-theme-light",
	scrollbarAutoHide: "leave",
	scrollbarClickScroll: true,
};
document.addEventListener("DOMContentLoaded", function() {
	const sidebarWrapper = document.querySelector(SELECTOR_SIDEBAR_WRAPPER);
	if (
		sidebarWrapper &&
		typeof OverlayScrollbarsGlobal?.OverlayScrollbars !== "undefined"
	) {
		OverlayScrollbarsGlobal.OverlayScrollbars(sidebarWrapper, {
			scrollbars: {
				theme: Default.scrollbarTheme,
				autoHide: Default.scrollbarAutoHide,
				clickScroll: Default.scrollbarClickScroll,
			},
		});
	}
});

// Gerencia links ativos e menu
$(() => {
	//console.log( "contextPath", contextPath );	
	//console.log( "requestURI", requestURI );
		
	let opcoesMenu = $('.sidebar-menu > .nav-item');
	
	for(let opcaoMenu of opcoesMenu){
					
		let activeLinks =
			$( opcaoMenu )
				.find( `.nav-treeview > .nav-item > .nav-link[href="${requestURI}"]` );
									
		if(activeLinks.length > 0){
									
			$( opcaoMenu ).addClass( 'menu-open' );
			$( opcaoMenu ).addClass( 'active' );
		
			for(let activeLink of activeLinks){
				$( activeLink ).addClass( 'active' );
			}
																
		}
										
	}		
	
});